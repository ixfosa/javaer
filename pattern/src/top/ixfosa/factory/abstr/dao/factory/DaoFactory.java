package top.ixfosa.factory.abstr.dao.factory;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;

/**
 * Created by ixfosa on 2021/7/10 20:39
 */
public interface DaoFactory {
    OrderMainDao CreateOrderMainDao();
    OrderDetailDao CreateOrderDetailDao();
}
