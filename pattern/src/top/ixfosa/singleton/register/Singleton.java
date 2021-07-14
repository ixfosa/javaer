package top.ixfosa.singleton.register;

/**
 * Created by ixfosa on 2021/7/14 22:24
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 */
public class Singleton {

    private Singleton() {

    }

    private static final Map<String, Object> register = new HashMap<>();

    public static final Singleton getInstance(String name) {
        if (name == null) {
            name = String.class.getName();
        }

        if (register.get(name) == null) {
            register.put(name, new Singleton());
        }

        return (Singleton) register.get(name);
    }

}
