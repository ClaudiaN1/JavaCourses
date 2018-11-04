package OOP;

// interface are avantajul ca in fiecare clasa putem scrie fiecare metoda cum vrem , nu trebuie sa aibe fiecare clasa acelasi body la aceasi metoda
// toate clasele trebuie sa contina toate metodele din interface
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;



public interface Learnable {



    //method signature, no body
    //MUST be implement in class that IMPLEMENT Learnable
    public void lear();      //ca sa punem o metoda fara body at clasa in care o apelam trebuie sa fie abstracta




    //static method
    //CANNOT be overrided , this is a class method
    public static void learnJava(int version)
    {
        System.out.println("Learn java SE version " + version);
    }




    //default method
    //CAN be overrided
    public  default String speak ( String text)
    {
        return  text;
    }


    //visibile only internal
    /* private


    */
}
