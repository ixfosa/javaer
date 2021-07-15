package top.ixfosa.singleton.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ixfosa on 2021/7/15 20:18
 */
public class SeriableSafeTest {

    public static void main(String[] args) {

        SeriableSafe s1 = null;
        SeriableSafe s2 = SeriableSafe.getInstance();

        try {
            FileOutputStream fout = new FileOutputStream("SeriableSafe.obj");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s2);
            oout.flush();
            oout.close();

            FileInputStream fin = new FileInputStream("SeriableSafe.obj");
            ObjectInputStream oin = new ObjectInputStream(fin);
            s1 = (SeriableSafe) oin.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
