package bank;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BankCoountTest {


    public static void main(String[] args) {


        Person employee1 = new Person("Jhon",
                                      Employer.BRD,
                                     "Timisoara");

        employee1.setName("Jane");
        System.out.println(employee1);

        BankAcount johnsAccount = new BankAcount(employee1,
                                                 100000d,
                                                  1234);

        System.out.println(johnsAccount);

    }



}
