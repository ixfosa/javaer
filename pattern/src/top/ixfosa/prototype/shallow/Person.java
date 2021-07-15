package top.ixfosa.prototype.shallow;

/**
 * Created by ixfosa on 2021/7/15 20:48
 */
// Cloneable 标识接口
public class Person implements Cloneable{
    private String name;
    private Heart heart;

    public Person(String fo, top.ixfosa.prototype.deep.Heart heart) {
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
        return super.clone();
    }
}
