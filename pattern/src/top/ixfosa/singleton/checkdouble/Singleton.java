package top.ixfosa.singleton.checkdouble;

/**
 * Created by ixfosa on 2021/7/14 22:02
 */


/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class Singleton {

    private Singleton() {

    }

    private static volatile Singleton instance;

    public static final Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
