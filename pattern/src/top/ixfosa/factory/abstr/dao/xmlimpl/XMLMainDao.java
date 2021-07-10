package top.ixfosa.factory.abstr.dao.xmlimpl;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;
import top.ixfosa.factory.abstr.dao.factory.DaoFactory;

/**
 * Created by ixfosa on 2021/7/10 20:53
 */
public class XMLMainDao implements OrderMainDao {

    @Override
    public void SaveOrderMain() {
        System.out.println("XMLMainDao OrderMainDao SaveOrderMain");
    }

    @Override
    public void delOrderMain() {
        System.out.println("XMLMainDao OrderMainDao delOrderMain");
    }
}
