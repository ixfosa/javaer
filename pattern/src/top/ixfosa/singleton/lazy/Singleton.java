package top.ixfosa.singleton.lazy;

/**
 * Created by ixfosa on 2021/7/10 21:58
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
