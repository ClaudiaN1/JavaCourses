package OOP;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        ParentClass parent = new ParentClass(" Mihai ", 34);
        System.out.println(parent);



        Child child = new Child(" Adela ", 13,"Colegiu Banatean");
        System.out.println(child);



        //method from Learnable
        //overrided in ChildClass
        child.lear();



        //static
        Learnable.learnJava(8);  //pentru ca este statica se apeleaza cu numele clasei.numele metodei



        //default ( not overrided)
        System.out.println(child.speak("mama"));
        System.out.println();




    }

}
