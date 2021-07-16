package top.ixfosa.proxy.staticed;

/**
 * Created by ixfosa on 2021/7/16 19:42
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sayHello() {
        System.out.print("Hello ");
        subject.sayHello();
    }
}
