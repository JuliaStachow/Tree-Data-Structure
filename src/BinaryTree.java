public class BinaryTree {

    Node root;

    BinaryTree() { root = null; }
    BinaryTree(int value) { root = new Node(value); }

    public int leavesCounting(Node node){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return leavesCounting(node.left) + leavesCounting(node.right);
    }

    public int largestNumberOfEdges(Node node) {
        int leftPath, rightPath;

        if (node == null || (node.left == null && node.right == null))
            return 0;
        else {
            leftPath = largestNumberOfEdges(node.left);
            rightPath = largestNumberOfEdges(node.right);
        }

        if (leftPath > rightPath)
            return (leftPath+1);
        else
            return (rightPath+1);
    }

    public boolean areEquivalent(Node node1, Node node2)
    {
        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        return node1.value == node2.value && areEquivalent(node1.left, node2.left) && areEquivalent(node1.right, node2.right);
    }
}


