package top.ixfosa.singleton.innerclass;

/**
 * Created by ixfosa on 2021/7/10 21:58
 */

/**
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class Singleton {

    private static boolean initialized = false;

    // 如果没使用的话，内部类是不加载的
    private Singleton(){
        synchronized (Singleton.class){
            if(!initialized){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    // 默认不加载
    private static class LazyHolder {
        private static final Singleton LAZY = new Singleton();
    }

    public static final Singleton getInstance() {
        return LazyHolder.LAZY;
    }
}
