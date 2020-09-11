package DataStructures.fHashTable;

public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0; // counter for number of elements in the hash table

    public HashTable(int noOfSlots) {
        if (isPrime(noOfSlots)) {
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;

            System.out.println("Hash table size given " + noOfSlots + " is not a prime");
            System.out.println("Hash table size changed to: " + primeCount);
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getNextPrime(int minNumber) {
        for (int i = minNumber; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    // returns preferred index position
    private int hashFunction1(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if (hashVal < 0) {
            hashVal += arraySize;
        }

        return hashVal; // ideal index position we'd like to insert or search in
    }

    // return step size greater than 0
    private int hashFunction2(String word) {
        int hashVal = word.hashCode();
        hashVal %= arraySize;  // hasVal = hashVal % arraySize

        if (hashVal < 0) {
            hashVal += arraySize;
        }

        return 3 - hashVal % 3;
    }

    public void insert(String word) {
        int hasVal = hashFunction1(word);
        int stepSize = hashFunction2(word);

        while (hashArray[hasVal] != null) {
            hasVal = hasVal + stepSize;
            hasVal = hasVal % arraySize;
        }

        hashArray[hasVal] = word;
        System.out.println("insert word: " + word);
    }

    public String find(String word) {
        int hasVal = hashFunction1(word);
        int stepSize = hashFunction2(word);

        while (hashArray[hasVal] != null) {
            if (hashArray[hasVal].equals(word)) {
                return hashArray[hasVal];
            }
            hasVal = hasVal + stepSize;
            hasVal = hasVal % arraySize;
        }
        return hashArray[hasVal];
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int i = 0; i < arraySize; i++){
            if (hashArray[i] != null) {
                System.out.println(hashArray[i] + " ");
            } else {
                System.out.print("** ");
            }
            System.out.println(" ");
        }
    }
}
