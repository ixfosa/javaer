package top.ixfosa.proxy.cglib;

/**
 * Created by ixfosa on 2021/7/16 19:39
 */
public class RealSubject implements Subject {

    private String name;

    public RealSubject(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(this.name);
    }
}
