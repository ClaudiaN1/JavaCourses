package bank;


import utils.FileUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static bank.Person.fileToPersonList;

public class Homework {


    public static void main(String[] args) throws IOException { // deserializare
        //step 1
        //user.dir/BankResources/Homework/timisoara_employees.txt


        List<Person> personList = fileToPersonList(                   // punem toata caiile pana ajungem la fiserulul dorit de noi
                ResourcesDirectories.BankResources.name(),
                ResourcesDirectories.Homework.name(),                 //"Homework" sau mai putem sc ResourcesDirectories.Homework.name() .. cu conditia sa scriem in ResourcesDirectories Homework
                "timisoara_employees.txt");

        // avem mai multi separatori si trebuie sa ii adaugam pe toti ..mergem in Person si completam acolo cu " \\s*(,| .|;| : )\\s*"
        // personList.forEach(System.out::println);


        //step 2 + 3
        int azetsCount = countEmployees(personList, Employer.Azets);
        String azetsStatistics = Employer.Azets.name() + ": " + azetsCount;
        //System.out.println(azetsStatistics);
        String statistics = "Timisoara IT companies employee statistics:\n" + getStatistics(personList);
        System.out.println(statistics);

<<<<<<< HEAD
=======

import java.util.Arrays;


public class Homework {
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a

        //statistica
        Path outputFilePath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                ResourcesDirectories.Homework.name(),
                "timisoara_employees_statistics.txt");

<<<<<<< HEAD
        Files.write(outputFilePath, statistics.getBytes());
    }

    //step2
    public static int countEmployees(List<Person> personList, Employer employer) {
        int count = 0;
        for (Person currentPerson : personList) {
            if (currentPerson.getEmployer().equals(employer)) {
                count++;
            }
        }
        return count;
=======
    public static void main(String[] args) {
        String text = "dog,cat,mouse";

        String[] textTokens = text.split(",");
        System.out.println(Arrays.toString(textTokens));
        // implement flow here
        // put any additional functions also in this class
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a
    }

    //step 3
    public static String getStatistics(List<Person> personList) {
        // Employer[]  employes = Employer.values();
        String statistics = " ";
        List<Employer> employers = Arrays.asList(Employer.values());

        for (Employer currentEmployer : employers) {
            int employerCount = countEmployees(personList, currentEmployer);
            // String azetsStatistics = Employer.Azets.name() + ": "+ employerCount;
            statistics += "\n" + currentEmployer.name() + ": " + employerCount + "\n";
        }
        return statistics;
    }
}
