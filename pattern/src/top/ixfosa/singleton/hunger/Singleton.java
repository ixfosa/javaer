package top.ixfosa.singleton.hunger;

/**
 * Created by ixfosa on 2021/7/10 21:20
 */
public class Singleton {
    // 私有构造
    private Singleton() {}

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }


}
