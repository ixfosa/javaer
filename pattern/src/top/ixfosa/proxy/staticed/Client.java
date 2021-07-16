package top.ixfosa.proxy.staticed;

/**
 * Created by ixfosa on 2021/7/16 19:43
 */
public class Client {

    public static void main(String[] args) {

        Subject proxy = new ProxySubject(new RealSubject("ixfosa"));
        proxy.sayHello();
    }
}
