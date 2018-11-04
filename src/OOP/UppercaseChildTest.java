package OOP;

public class UppercaseChildTest {
    public static void main(String[] args) {

        Child uppercaseChild = new UppercaseChild(
                "Mario ",
                5,
                "Colegiul National ");

        System.out.println(uppercaseChild);

        //Object <- ParentClass <- Child <- UppercaseChild
        System.out.println(uppercaseChild instanceof UppercaseChild);
        System.out.println(uppercaseChild instanceof Child);
        System.out.println(uppercaseChild instanceof ParentClass);
        System.out.println(uppercaseChild instanceof Object);

        System.out.println(uppercaseChild);
        uppercaseChild.lear();
        //overrided Learnable default method " speak " ;
        System.out.println(uppercaseChild.speak(
                "this is my first school year "));

    }
}
