package top.ixfosa.prototype.deep;

import java.io.*;

/**
 * Created by ixfosa on 2021/7/15 20:48
 */
// Cloneable 标识接口
public class Person implements Cloneable, Serializable{
    private String name;
    private Heart heart;

    public Person() {
    }

    public Person(String name, Heart heart) {
        this.heart = heart;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return copy();
    }

    private Person copy() {
        Person person = null;
        try {
            // 将对象写入流中
            ByteArrayOutputStream baout = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(baout);
            oout.writeObject(this);

            // 将对象从流中取出
            ByteArrayInputStream bain = new ByteArrayInputStream(baout.toByteArray());
            ObjectInputStream oin = new ObjectInputStream(bain);
            person = (Person) oin.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}
