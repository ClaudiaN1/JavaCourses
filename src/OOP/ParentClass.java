package OOP;

public class ParentClass {

    private String name;
    private int age;

 /*   public ParentClass() // poate fi si gol
    {                      //daca nu sc aici un constructor default , at am nevoie
        this.name="";      //sa scriu un constructor in fiecare clasa derivata
        this.age= 0;
    }*/

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    // from Object
    public String toString() {
        return String.format(
                "Name:%s - Age: %s ",
                name,
                age);
    }
}
