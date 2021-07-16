package top.ixfosa.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ixfosa on 2021/7/16 19:42
 */
public class ProxySubject implements InvocationHandler {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("Hello ");
        Object o = method.invoke(this.subject, args);
        return o;
    }
}
