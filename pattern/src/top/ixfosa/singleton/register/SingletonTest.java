package top.ixfosa.singleton.register;

/**
 * Created by ixfosa on 2021/7/14 22:31
 */

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("name");
        Singleton s2 = Singleton.getInstance("name");
        System.out.println(s1 == s2);

        Singleton s3 = Singleton.getInstance("NAME");
        Singleton s4 = Singleton.getInstance("NAME");
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
    }
}
