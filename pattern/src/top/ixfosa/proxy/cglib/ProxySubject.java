package top.ixfosa.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ixfosa on 2021/7/16 19:42
 */
public class ProxySubject implements MethodInterceptor {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public Object getProxyInstance() {
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(Subject.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类代理对象
       return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.print("Hello ");
        return method.invoke(subject);
    }
}
