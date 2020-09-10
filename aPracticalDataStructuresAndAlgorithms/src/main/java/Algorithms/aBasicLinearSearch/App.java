package Algorithms.aBasicLinearSearch;

public class App {

    public static void main(String[] args) {
        int [] a = {11, 22, 34, 56, 4, 34};
        System.out.println(linearSearch(a, 5));
    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
