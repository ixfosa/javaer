package top.ixfosa.factory.abstr;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;
import top.ixfosa.factory.abstr.dao.factory.impl.RDBDaoFactory;
import top.ixfosa.factory.abstr.dao.factory.impl.XMLDaoFactory;

/**
 * Created by ixfosa on 2021/7/10 20:47
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        RDBDaoFactory factory = new RDBDaoFactory();

        OrderMainDao orderMainDao = factory.CreateOrderMainDao();
        orderMainDao.SaveOrderMain();

        OrderDetailDao orderDetailDao = factory.CreateOrderDetailDao();
        orderDetailDao.SaveOrderMain();

        XMLDaoFactory xmlDaoFactory = new XMLDaoFactory();
        OrderMainDao orderMainDao1 = xmlDaoFactory.CreateOrderMainDao();
        orderMainDao1.delOrderMain();

        OrderDetailDao orderDetailDao1 = xmlDaoFactory.CreateOrderDetailDao();
        orderDetailDao1.delOrderMain();

    }
}
