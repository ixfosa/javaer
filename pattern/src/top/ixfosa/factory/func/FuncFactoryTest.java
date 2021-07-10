package top.ixfosa.factory.func;

/**
 * Created by ixfosa on 2021/7/10 19:35
 */
public class FuncFactoryTest {

    public static void main(String[] args) {

        FuncFactory benzFactory = new BenzFactory();
        System.out.println(benzFactory.getCar().getName());

        FuncFactory bmwFactory = new BmwFactory();
        System.out.println(bmwFactory.getCar().getName());
    }
}
