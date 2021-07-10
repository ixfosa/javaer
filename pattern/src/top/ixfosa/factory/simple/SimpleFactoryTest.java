package top.ixfosa.factory.simple;

/**
 * Created by ixfosa on 2021/7/10 19:24
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();

        System.out.println(factory.getCar("BMW").getName());
        System.out.println(factory.getCar("BENZ").getName());
    }
}
