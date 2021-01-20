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


    public static void main(String[] args) throws IOException {
        //step 1
        //user.dir/BankResources/Homework/timisoara_employees.txt


        List<Person> personList = fileToPersonList(                 
                ResourcesDirectories.BankResources.name(),
                ResourcesDirectories.Homework.name(),                
                "timisoara_employees.txt");
        
        // personList.forEach(System.out::println);
        
        //step 2 + 3
        int azetsCount = countEmployees(personList, Employer.Azets);
        String azetsStatistics = Employer.Azets.name() + ": " + azetsCount;
        //System.out.println(azetsStatistics);
        String statistics = "Timisoara IT companies employee statistics:\n" + getStatistics(personList);
        System.out.println(statistics);


import java.util.Arrays;


public class Homework {

        //statistics
        Path outputFilePath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                ResourcesDirectories.Homework.name(),
                "timisoara_employees_statistics.txt");

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
        
    public static void main(String[] args) {
        String text = "dog,cat,mouse";

        String[] textTokens = text.split(",");
        System.out.println(Arrays.toString(textTokens));
        // implement flow here
        // put any additional functions also in this class
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
