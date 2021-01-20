package test_18_11_10;

import bank.Employer;
import bank.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieTest {
    public static void main(String[] args) {


        /*File file = new File("C:\\Users\\Claudia Elena\\Desktop\\SDA\\Trainer\\learnJava\\test_18_11_10");
        BufferedReader br = new BufferedReader(new FileReader("movieList"));
        String st;
        List<Movie> all= new ArrayList<>();
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }*/

        List<Movie> all = Arrays.asList(
                new Movie("Venom", 20018, 10),
                new Movie("Aquaman", 2018, 8),
                new Movie("Mile", 2018, 9),
                new Movie("Blade Runner 2049", 2017, 9),
                new Movie("Murder on the Orient Express", 2017, 8),
                new Movie("Baby", 2017, 6),
                new Movie("Deadpool", 2016, 5),
                new Movie("Noctural", 2016, 9),
                new Movie("Manchester by the Sea", 2016, 8),
                new Movie("The Invizible Guest", 2016, 7)
        );


        //System.out.println(all);
      //  System.out.println(getAverage(all));
        System.out.println(bi(all,9));

    }

    private static float getAverage(List<Movie> movieList) {

        float sum = 0;
        int count = 0;


        /*for (int i=0; i < movieList.size(); i++){
            currenyMovie = movieList.get(i);
            ...
        }*/

        for (Movie currentMovie : movieList) {

            if (currentMovie.getYear() == 2016
                    || currentMovie.getYear() == 2018) {

                sum += currentMovie.getTicketPrice();
                count++;

            }
        }
        if (count == 0) {
            return 0;
        }

        return sum / count;

    }
private static List<Movie> bi( List<Movie> movieList, float givenValue)
{
    List<Movie> finalList = new ArrayList<>();

    for( Movie curentMovie : movieList)
    {
        if(MovieUtils.getPrice(curentMovie) > givenValue){
            finalList.add(curentMovie);
        }
    }
    return finalList;
}

}
