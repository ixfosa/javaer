package top.ixfosa.factory.abstr.dao.rdbimpl;

import top.ixfosa.factory.abstr.dao.OrderMainDao;

/**
 * Created by ixfosa on 2021/7/10 20:40
 */
public class RDBMainDao implements OrderMainDao {
    @Override
    public void SaveOrderMain() {
        System.out.println("RDBMainDao OrderMainDao SaveOrderMain...");
    }

    @Override
    public void delOrderMain() {
        System.out.println("RDBMainDao OrderMainDao delOrderMain...");
    }
}
