package top.ixfosa.singleton.innerclass;


import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ixfosa on 2021/7/10 21:21
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {

        CountDownLatch latch = new CountDownLatch(100);
        final Set<Singleton> syncSet = Collections.synchronizedSet(new HashSet<Singleton>());

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                syncSet.add(Singleton.getInstance());
            }).start();
            latch.countDown();
        }

        latch.await();
        System.out.println(syncSet.size());

        // 进行破坏
        Class<?> clazz = Singleton.class;

        // 通过反射拿到私有的构造方法
        Constructor c = clazz.getDeclaredConstructor(null);
        // 强制访问
        c.setAccessible(true);

        // 暴力初始化
        Object o1 = c.newInstance(); // Caused by: java.lang.RuntimeException: 单例已被侵犯

    }
}
