package top.ixfosa.factory.abstr.dao.rdbimpl;

import top.ixfosa.factory.abstr.dao.OrderDetailDao;

/**
 * Created by ixfosa on 2021/7/10 20:42
 */
public class RDBDetailDao implements OrderDetailDao {
    @Override
    public void SaveOrderMain() {
        System.out.println("RDBDetailDao OrderDetailDao  SaveOrderMain");
    }

    @Override
    public void delOrderMain() {
        System.out.println("RDBDetailDao OrderDetailDao  delOrderMain");
    }
}
