package top.ixfosa.prototype.deep;


/**
 * Created by ixfosa on 2021/7/15 21:14
 */
public class DeepTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person fo = new Person("fo", new Heart("red"));

        Person clone = (Person) fo.clone();

        System.out.println(fo.getName());    // fo
        System.out.println(clone.getName()); // fo

        clone.setName("FO");  // fo
        clone.getHeart().setColor("green");  // green

        System.out.println(clone.getName());   // FO
        System.out.println(fo.getName());      // fo


        System.out.println(fo.getHeart().getColor());  // red
        System.out.println(clone.getHeart().getColor());  // green
    }
}
