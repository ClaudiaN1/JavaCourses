package DataStructures.aStackDataStructure;

public class App {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);

      /*  theStack.push(20);
        theStack.push(18);
        theStack.push(26);
        theStack.push(30);
        theStack.push(48);
        theStack.push(73);*/


        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

        System.out.println(reverseString("Lenu"));
    }

    public static String reverseString(String string) {
        int stackSize = string.length(); // get the max stack size
        Stack theStack = new Stack(stackSize); // we make the stack
        for (int j = 0; j < string.length(); j++) {
            char ch = string.charAt(j); // getting a char from the input string
            theStack.push(ch);
        }

        String result = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result + ch; //appending to the output
        }
        return result;
    }
}
