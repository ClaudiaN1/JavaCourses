package OOP;

public class Child extends ParentClass   // am mostenit clasa Parent
implements  Learnable {

    private String schoolName;


    public Child(String name, int age, String schoolName) {  //am facut constructorul
       //parent constructor
        super(name, age);                      //super - apeleza name si age din
                                               //clasa de baza( ParentClass )
        this.schoolName=schoolName;

    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    //from Learnable
    public void lear() {
        System.out.println("learning ....");

    }

    @Override    //suprascriu
    public String toString() {
        return super.toString() + " " + schoolName;
    }
}
