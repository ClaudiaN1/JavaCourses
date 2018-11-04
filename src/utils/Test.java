package utils;
//path ii o cale iar paths

import bank.Employer;
import bank.Person;
import bank.ResourcesDirectories;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static bank.FileUtiles.getLocalPath;
//import static bank.ResourcesDirectories


public class Test {

    public static void main(String[] args) throws IOException {
       //TODO move to separate files
        //testFileUtils();

      /*  try {
            throw new Exception(" test exception");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        List<String> employeesLines = fileLineToList("employees.csv");                     //(undeva in test ii aici) ..si aduga BankResourece.name(), " employees.csv;

    }

    private static List<String> fileLineToList(String s) {
        return
    }

    private static void testFileUtils() {
        final String USER_DIR = System.getProperty("user.dir");

        System.out.println("User directory: " + USER_DIR);                              // pentru a ne afisa unde este fisieru principal learnJava;
        System.out.println();


        Path fullFilePath = getLocalPath(ResourcesDirectories.BankResources.name(), "employees.csv");
        System.out.println(fullFilePath);

        //prints user.dir
        // System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\Claudia Elena\\Desktop\\SDA\\learnJava\\BankResources\\employees.csv"));
    }


}
