package DERS;

public class BinaryTreeTest {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        int[] valuesToAdd = {64, 32, 128, 48, 72, 87, 16, 4, 150, 36, 66, 10, 114};

        System.out.println("Adding nodes:");
        for (int value : valuesToAdd) {
            System.out.println("  addNode(" + value + ")");
            tree.addNode(value);
        }

        System.out.println();

        System.out.print("In-Order Traversal: ");
        tree.printInOrder();

        System.out.println("\nNumber of leaves: " + tree.countLeaves());

        System.out.println("\nSearch tests:");
        System.out.println("searchNode(66) -> " + tree.searchNode(66));
        System.out.println("searchNode(100)-> " + tree.searchNode(100));

        System.out.println("\nRemoving 4...");
        tree.removeNode(4);

        System.out.print("In-Order after removing 4: ");
        tree.printInOrder();

        System.out.println("\nNumber of leaves after removing 4: " + tree.countLeaves());

        System.out.println("\nRemoving 64 (root)...");
        tree.removeNode(64);

        System.out.print("In-Order after removing 64: ");
        tree.printInOrder();

        System.out.println("\nNumber of leaves after removing 64: " + tree.countLeaves());
    }
}

