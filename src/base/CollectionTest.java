package base;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
      //  listTest();
        TreeMap<Integer, String> mapOfString = new TreeMap<>();

        // create entries (add)
        mapOfString.put(2,"second");
        mapOfString.put(3,"third");
        mapOfString.put(1,"first");

        //modify entry by key
       mapOfString.put(1,"new first");


        Set<Integer>keys = mapOfString.keySet();
        System.out.println(" Keys " + keys);
        System.out.println("Value "+ mapOfString.values());

        for(int key : keys  )
        {
            System.out.println(key + " : " + mapOfString.get(key));
        }

      //  keys.forEach( System.out::println);

    }

    private static void listTest() {
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("first");
        listOfStrings.add("second");
        listOfStrings.add("third");


        for( int i=0; i< listOfStrings.size(); i++)
        {
            System.out.println(listOfStrings.get(i));
        }
    }
}
