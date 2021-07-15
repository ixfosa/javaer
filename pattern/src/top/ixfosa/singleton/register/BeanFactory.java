package top.ixfosa.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ixfosa on 2021/7/15 20:10
 */
public class BeanFactory {

    private static final Map<String, Object> ioc = new HashMap<>();

    public static Object getBean(String className) {
        Object o = null;
        if (!ioc.containsKey(className)) {
            try {
                o = Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return o;
        }
        return ioc.get(className);
    }

    public static void main(String[] args) {


    }
}
