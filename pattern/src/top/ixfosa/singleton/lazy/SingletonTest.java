package top.ixfosa.singleton.lazy;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ixfosa on 2021/7/10 21:21
 */
public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
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
    }
}
