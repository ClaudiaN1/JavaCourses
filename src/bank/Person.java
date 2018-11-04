package bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Person {


    private String name;
    private Employer employer;
    private String location;


    public Person(String name, Employer employer, String location) {
        this.name = name;
        this.employer = employer;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("\nName : %s\nEmployer : %s\nLocation: %s",
                name,
                employer,
                location);
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static Person stringToPerson(String text) {
        String[] textTokens = text.split("\\s*,\\s*");

        String name = textTokens[0];//.trim();
        String location = textTokens[1];//.trim();

        //Employer.Visma.name()--->return "Visma"
        //Employer.valueOf("Visma")--->return Employer.Visma
        Employer employer = Employer.valueOf(textTokens[2]);//.trim());
    
   /* String name = " " ;
    Employer employer = Employer.Unknow;
    String location = "";*/

        return new Person(name, employer, location);


    }

    public static List<String> fileLinesToList(String localFilePath) throws IOException {            //pun in fata lu string...
        Path employerFullPath = FileUtiles.getLocalPath(
                ResourcesDirectories.BankResources.name(),                  //getLocalPath(more)...celalate le sterg si le pun undeva in test
                localFilePath);
        List<String> fileLine = Files.readAllLines(employerFullPath);
        for (String line : fileLine) {
            if (line.isEmpty() == false)
                System.out.println(line);
        }

        return Collections.emptyList();
    }


    public static void main(String[] args) {
        String text = " Anda , Bucuresti , Visma";

        System.out.println(stringToPerson(text));
    }


}
