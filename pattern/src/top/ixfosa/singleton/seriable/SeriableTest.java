package top.ixfosa.singleton.seriable;

import java.io.*;

/**
 * Created by ixfosa on 2021/7/15 20:18
 */
public class SeriableTest {

    public static void main(String[] args) {

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        try {
            FileOutputStream fout = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s2);
            oout.flush();
            oout.close();

            FileInputStream fin = new FileInputStream("Seriable.obj");
            ObjectInputStream oin = new ObjectInputStream(fin);
            s1 = (Seriable) oin.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
