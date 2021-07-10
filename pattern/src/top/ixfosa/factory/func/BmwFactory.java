package top.ixfosa.factory.func;

import top.ixfosa.factory.Bmw;
import top.ixfosa.factory.Car;

/**
 * Created by ixfosa on 2021/7/10 19:34
 */
public class BmwFactory implements FuncFactory {

    @Override
    public Car getCar() {
        return new Bmw();
    }
}
