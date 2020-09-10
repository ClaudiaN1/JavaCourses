package DataStructures.cLinkedListDataStructure.dDoublyLinkedList;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(13);
        theList.insertFirst(17);
        theList.insertFirst(19);

        theList.insertLast(23);
        theList.insertLast(25);
        theList.insertLast(28);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(13);

        theList.displayForward();

        theList.insertAfter(23, 45);
        theList.insertAfter(17, 57);

        theList.displayForward();

    }
}
