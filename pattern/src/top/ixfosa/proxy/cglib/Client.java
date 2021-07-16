package top.ixfosa.proxy.cglib;

import java.lang.reflect.Proxy;

/**
 * Created by ixfosa on 2021/7/16 19:43
 */
public class Client {

    public static void main(String[] args) {

        ProxySubject proxySubject = new ProxySubject(new RealSubject("ixfosa!!!"));

        Subject proxy = (Subject) proxySubject.getProxyInstance();

        proxy.sayHello();
    }
}
