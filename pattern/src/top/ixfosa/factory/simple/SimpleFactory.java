package top.ixfosa.factory.simple;

import top.ixfosa.factory.Benz;
import top.ixfosa.factory.Bmw;
import top.ixfosa.factory.Car;

/**
 * Created by ixfosa on 2021/7/10 19:20
 */
public class SimpleFactory {

    public Car getCar(String name) {

        if ("BMW".equalsIgnoreCase(name)) {
            return new Bmw();
        } else if ("BENZ".equalsIgnoreCase(name)) {
            return new Benz();
        } else {
            System.out.println("can't create...");
            return null;
        }
    }


}
