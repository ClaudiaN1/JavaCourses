package OOP;

import java.util.Objects;

public class ObjectTest {

    public static void main(String[] args) {

        Object obj = new Object();
        Object obj2 = new Object();

        System.out.println(obj.toString());

        System.out.println(" hashCode ( unique for any object ) " + obj.hashCode());
        System.out.println("hashCode " + obj.hashCode());

        System.out.println("obj.equals(obj): " + obj.equals(obj));
        System.out.println("obj.equals(obj2): " + obj.equals(obj2));


    }
}
