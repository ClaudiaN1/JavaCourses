package DataStructures.cLinkedListDataStructure.cCircularList;

public class App {

    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(7777);

        myList.displayList();

    }
}
