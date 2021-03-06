package DataStructures.dBinarySearchTree;

public class App {

    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(15, "Fifteen");

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);

        System.out.println(tree.remove(10)); // print true

        System.out.println(tree.findMin().key);  // print 15
    }
}
