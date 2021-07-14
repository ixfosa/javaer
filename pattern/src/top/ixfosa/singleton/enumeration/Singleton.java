package top.ixfosa.singleton.enumeration;

/**
 * Created by ixfosa on 2021/7/14 22:16
 */

/**
 * JDK 版本：JDK1.5
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 */
public enum Singleton {
    INSTANCE;

    public void print() {
        System.out.println("enum...");
    }
}
