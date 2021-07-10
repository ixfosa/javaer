package top.ixfosa.factory.abstr.dao.factory.impl;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;
import top.ixfosa.factory.abstr.dao.rdbimpl.RDBDetailDao;
import top.ixfosa.factory.abstr.dao.rdbimpl.RDBMainDao;
import top.ixfosa.factory.abstr.dao.factory.DaoFactory;

/**
 * Created by ixfosa on 2021/7/10 20:44
 */
public class RDBDaoFactory implements DaoFactory {
    @Override
    public OrderMainDao CreateOrderMainDao() {
        return new RDBMainDao();
    }

    @Override
    public OrderDetailDao CreateOrderDetailDao() {
        return new RDBDetailDao();
    }

}
