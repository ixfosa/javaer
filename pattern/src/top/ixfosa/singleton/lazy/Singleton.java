package top.ixfosa.singleton.lazy;

/**
 * Created by ixfosa on 2021/7/10 21:58
 */

/**
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }
}
