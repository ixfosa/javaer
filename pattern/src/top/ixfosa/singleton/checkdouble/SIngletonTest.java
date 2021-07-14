package top.ixfosa.singleton.checkdouble;



import top.ixfosa.singleton.lazy.SyncSingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ixfosa on 2021/7/14 22:17
 */
public class SIngletonTest {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(100);

        final Set<Singleton> syncSet = Collections.synchronizedSet(new HashSet<>());

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
