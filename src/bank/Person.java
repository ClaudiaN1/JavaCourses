package bank;

import org.junit.jupiter.api.Test;
import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
import java.util.Collections;
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a
import java.util.Comparator;
import java.util.List;

public class Person {

    public static final String separatoRegex = "\\s*(,|\\.|;|:)\\s*";

    public static class CompareByName implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {

            return a.name.compareTo(b.name);
        }
    }


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

        return String.format(
                "\nName: %s\nEmployer: %s\nLocation: %s",
                name,
                employer.name(),
                location);
    }


    public void setName(String name) {
        this.name = name;
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


<<<<<<< HEAD
    public static Person stringToPerson(String text){  //convertim din string in persoana
=======
    public static Person stringToPerson(String text) {
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a

        // text = "Anda, Bucuresti,   Visma"
        String[] textTokens = text.split(separatoRegex);
      // System.out.println(Arrays.toString(textTokens));

        String name = textTokens[0];
        String location = textTokens[1];

        // Employer.Visma.name() ---> returns "Visma"
        // Employer.valueOf("Visma") ---> returns Employer.Visma
        Employer employer = Employer.valueOf(textTokens[2]); // valueOf = se foloseste pentru a accesa enumeratia Employer

        return new Person(name, employer, location);
    }


    public static List<Person> fileToPersonList(String... more) throws IOException { // func care primeste path si scoate o lista de pers

        List<String> fileLines = FileUtils.fileLinesToList(more); // citeste linie cu linie din path si le baga intr o lista

        List<String> nonEmptyLines = FileUtils.extractNonEmptyLines(fileLines);

        List<Person> personList = new ArrayList<>();

<<<<<<< HEAD
        for(String line : nonEmptyLines){ //filtram dupa liniile goale? adica scoate din lista spatiile goale
=======
        for (String line : nonEmptyLines) {
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a

            Person currentPerson = stringToPerson(line);
            personList.add(currentPerson);
        }

        return personList;
    }


    private static List<Person> getEmployees(List<Person> personList, String location) { // filtru//adauga in lista dupa locatie ?

        List<Person> BucurestiEmployees = new ArrayList<>();

        for (Person person : personList) {

<<<<<<< HEAD
            if(person.location.equals(location)){
                BucurestiEmployees.add(person);
=======
            if (person.location.equals(location)) {
                timisoaraEmployees.add(person);
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a
            }
        }

        return BucurestiEmployees;
    }


    private static List<Person> getEmployees(List<Person> personList, Employer employer) {// filtru

        List<Person> employees = new ArrayList<>();//

        for (Person person : personList) {

            if (person.employer.equals(employer)) {
                employees.add(person);
            }
        }

        return employees;
    }


    private static List<Person> getEmployees(  // filtru
            List<Person> personList,
            Employer employer,
            String location) {

        List<Person> employees = new ArrayList<>();

        for (Person person : personList) {

            if (person.employer.equals(employer) && person.location.equals(location)) {
                employees.add(person);
            }
        }

        return employees;
    }


    public static void main(String[] args) throws IOException {

        List<Person> personList = fileToPersonList(
                ResourcesDirectories.BankResources.name(),
                "employees.csv");

        List<Person> timisoaraEmployees = getEmployees(
                personList,
                "Bucuresti");

        List<Person> employesFromVisma = getEmployees(
                personList,
                Employer.Visma);

        List<Person> employesFromVismaTimisora = getEmployees(
                personList,
                Employer.Visma,
                "Timisoara");


        /*for(Person person : timisoaraEmployees){
            System.out.println(person);
        }*/

        String finalText = "";
        for (Person person : employesFromVismaTimisora) {
            finalText += person.toString() + "\n";
        }

        System.out.println(finalText);   // ptr a adauga doar angajatii din timisoara

        Path outFilePath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                "employeesFromVismaTimisoara.txt");

<<<<<<< HEAD
        Files.write(outFilePath, finalText.getBytes()); //.write ptr a le scrie pe toate intr o lista separata
=======
        Files.write(outFilePath, finalText.getBytes());


        // SORT

        System.out.println("\n*** Sorted ***");

        List<Person> personListSorted = new ArrayList<>();
        personListSorted.addAll(personList);

        Collections.sort(

                personListSorted,

                new Comparator<Person>() {

                    @Override
                    public int compare(Person p1, Person p2) {
                        return p1.getName().compareTo(p2.getName());
                    }
                });


        personListSorted.forEach(System.out::println);
>>>>>>> 4f3e30440454c5e27dd436ca0a93db5c1528e50a
    }



}
