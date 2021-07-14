package top.ixfosa.singleton.lazy;

/**
 *  Created by ixfosa on 2021/7/10 21:58
*/

 /**
 * 懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class SyncSingleton {

    private SyncSingleton() {}

    private static SyncSingleton instance = null;

    public synchronized static SyncSingleton getInstance() {
        if (instance == null) {
            instance =  new SyncSingleton();
        }
        return instance;
    }
}
