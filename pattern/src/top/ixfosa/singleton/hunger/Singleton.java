package top.ixfosa.singleton.hunger;

/**
 * Created by ixfosa on 2021/7/10 21:20
 */

/**
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 */
public class Singleton {
    // 私有构造
    private Singleton() {}

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }


}
