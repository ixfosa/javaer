package top.ixfosa.factory.func;

import top.ixfosa.factory.Benz;
import top.ixfosa.factory.Car;

/**
 * Created by ixfosa on 2021/7/10 19:34
 */
public class BenzFactory implements FuncFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
