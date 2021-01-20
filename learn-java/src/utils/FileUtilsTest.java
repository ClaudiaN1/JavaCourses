package utils;

import bank.ResourcesDirectories;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilsTest {

    @Test
    public  void test_file_utils() {   //

   /* public static void main(String[] args) {

        testFileUtils();
    }*/


  /*  public static void testFileUtils(){*/

        final String USER_DIR = System.getProperty("user.dir");
        System.out.println("User directory: " + USER_DIR);

        Path fullFilePath = FileUtils.getLocalPath(
                ResourcesDirectories.BankResources.name(),
                "timisoara_employees.txt");

        System.out.println(fullFilePath);

        // prints user.dir
        // System.out.println(getLocalPath());

        System.out.println(Paths.get(
                "C:\\Users\\dan.rusu.IN"));
    }
}
