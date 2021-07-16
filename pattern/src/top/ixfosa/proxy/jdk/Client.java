package top.ixfosa.proxy.jdk;

import java.lang.reflect.Proxy;
import java.util.zip.Inflater;

/**
 * Created by ixfosa on 2021/7/16 19:43
 */
public class Client {

    public static void main(String[] args) {


        Subject o = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new ProxySubject(new RealSubject("ixfosa...")));

        o.sayHello();

    }
}
