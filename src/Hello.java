import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ChenJingwei
 * @date 2023/2/20 20:37
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println("hello git and github");
        System.out.println("do some changes");
        System.out.println("im cjw");

        System.out.println("===========================");

        ArrayList<Cat> arrayList = new ArrayList<Cat>();
        arrayList.add(new Cat("kitty", 4));
        arrayList.add(new Cat("wendi", 5));

        Iterator<Cat> iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());;

        }

    }
}
