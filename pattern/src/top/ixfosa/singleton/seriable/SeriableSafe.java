package top.ixfosa.singleton.seriable;

import java.io.Serializable;

/**
 * Created by ixfosa on 2021/7/15 20:16
 */
// 反序列化时导致单例破坏
public class SeriableSafe implements Serializable {

    private SeriableSafe() {

    }

    // 序列化就是说把内存中的状态通过转换成字节码的形式
    // 从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    // 内存中状态给永久保存下来了

    // 反序列化
    // 讲已经持久化的字节码内容，转换为IO流
    // 通过IO流的读取，进而将读取的内容转换为Java对象
    // 在转换过程中会重新创建对象new
    public static final SeriableSafe INSTANCE = new SeriableSafe();

    public static final SeriableSafe getInstance() {
        return INSTANCE;
    }

    // 实现readResolve方法后，jvm会有readResolve返回指定对象，也就保证了单例性。
    protected Object readResolve() throws Throwable {
        return INSTANCE;
    }
}
