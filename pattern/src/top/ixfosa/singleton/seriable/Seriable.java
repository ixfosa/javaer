package top.ixfosa.singleton.seriable;

import java.io.Serializable;

/**
 * Created by ixfosa on 2021/7/15 20:16
 */
// 反序列化时导致单例破坏
public class Seriable implements Serializable {

    private Seriable() {

    }

    // 序列化就是说把内存中的状态通过转换成字节码的形式
    // 从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    // 内存中状态给永久保存下来了

    // 反序列化
    // 讲已经持久化的字节码内容，转换为IO流
    // 通过IO流的读取，进而将读取的内容转换为Java对象
    // 在转换过程中会重新创建对象new
    public static final Seriable INSTANCE = new Seriable();

    public static final Seriable getInstance() {
        return INSTANCE;
    }
}
