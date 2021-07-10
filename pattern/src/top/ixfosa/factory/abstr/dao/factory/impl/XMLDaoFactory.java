package top.ixfosa.factory.abstr.dao.factory.impl;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;
import top.ixfosa.factory.abstr.dao.xmlimpl.XMLDetailDao;
import top.ixfosa.factory.abstr.dao.xmlimpl.XMLMainDao;
import top.ixfosa.factory.abstr.dao.factory.DaoFactory;

/**
 * Created by ixfosa on 2021/7/10 20:58
 */
public class XMLDaoFactory implements DaoFactory {
    @Override
    public OrderMainDao CreateOrderMainDao() {
        return new XMLMainDao();
    }

    @Override
    public OrderDetailDao CreateOrderDetailDao() {
        return new XMLDetailDao();
    }
}
