public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(0);
        tree.root.right.right.left = new Node(2);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(5);

        BinaryTree newTree = new BinaryTree();

        newTree.root = new Node(5);
        newTree.root.left = new Node(3);
        newTree.root.right = new Node(7);
        newTree.root.left.left = new Node(2);
        newTree.root.left.right = new Node(5);
        newTree.root.right.left = new Node(1);
        newTree.root.right.right = new Node(0);
        newTree.root.right.right.left = new Node(2);
        newTree.root.right.right.right = new Node(8);
        newTree.root.right.right.right.right = new Node(5);

        System.out.println("Number of leafs: " + tree.leavesCounting(tree.root));

        System.out.println("The largest number of edges: " + tree.largestNumberOfEdges(tree.root));

        if(tree.areEquivalent(tree.root, newTree.root)==true)
           System.out.println("Trees are equivalent");
        else
            System.out.println("Trees are not equivalent");
    }
}
