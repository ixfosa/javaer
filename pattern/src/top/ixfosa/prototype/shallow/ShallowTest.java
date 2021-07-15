package top.ixfosa.prototype.shallow;

/**
 * Created by ixfosa on 2021/7/15 20:58
 */


public class ShallowTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Heart heart = new Heart("red");
        Person fo = new Person("fo", heart);

        Person clone = (Person) fo.clone();

        System.out.println(fo.getName());    // fo
        System.out.println(clone.getName()); // fo

        clone.setName("FO");  // fo
        clone.getHeart().setColor("green");  // green

        System.out.println(clone.getName());   // FO
        System.out.println(fo.getName());      // fo

        // 拷贝的是对象引用
        System.out.println(fo.getHeart().getColor());  // green
    }
}
