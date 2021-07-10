package top.ixfosa.factory.abstr.dao.xmlimpl;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;
import top.ixfosa.factory.abstr.dao.OrderMainDao;

/**
 * Created by ixfosa on 2021/7/10 20:53
 */
public class XMLDetailDao implements OrderDetailDao {
    @Override
    public void SaveOrderMain() {
        System.out.println("XMLDetailDdao OrderDetailDao SaveOrderMain");
    }

    @Override
    public void delOrderMain() {
        System.out.println("XMLDetailDdao OrderDetailDao delOrderMain");
    }
}
