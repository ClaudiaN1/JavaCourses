package Algorithms.cRecursiveSearch;

public class App {

    public static void main(String[] args) {
        //reduceBuOne(10);
        System.out.println(recursiveLinearSearch(new int[]{1, 4, 5, 32, 56}, 0, 5));
    }

    public static void reduceBuOne(int n) {
        if (n >= 0) {
            reduceBuOne(n - 1);
        }
        System.out.println("Completed Call: " + n);
    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {
        if (i > a.length - 1) {  // if evaluates to true, x was not found in the array
            return -1;
        } else if (a[i] == x) return i;
        else {
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i + 1, x);
        }
    }
}
