import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClass {

    private Node node;
    private BinaryTree tree;

    @BeforeEach
    void setUp() throws Exception{
        System.out.println("set up");
        tree = new BinaryTree(5);
        node = new Node(1);
        tree.root.left = node;
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(4);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("tear down");
    }

    @Test
    void createNodeTest(){
        System.out.println("testing if a node is created with the right value");
        assertEquals(1, node.value);
    }

    @Test
    void createTreeTest(){
        System.out.println("testing if a tree is created with the right value");
        assertEquals(5, tree.root.value);
    }

    @Test
    void leavesCounting() {
        System.out.println("testing function for calculating leaves");
        assertEquals(2, tree.leavesCounting(tree.root));
    }

    @Test
    void largestNumberOfEdges() {
        System.out.println("testing function for calculating the largest number of edges");
        assertEquals(3, tree.largestNumberOfEdges(tree.root));
    }

    @Test
    void nodesAreNotEquivalent(){
        System.out.println("testing if two trees are not equivalent");
        BinaryTree tree1 = new BinaryTree(5);
        tree1.root.left = node;
        tree1.root.right = new Node(1); //changed value
        tree1.root.left.left = new Node(3);
        tree1.root.left.left.left = new Node(4);
        assertFalse(tree.areEquivalent(tree.root, tree1.root));
    }

    @Test
    void nodesAreEquivalent(){
        System.out.println("testing if two trees are equivalent");
        BinaryTree tree1 = new BinaryTree(5);
        tree1.root.left = node;
        tree1.root.right = new Node(2);
        tree1.root.left.left = new Node(3);
        tree1.root.left.left.left = new Node(4);
        assertTrue(tree.areEquivalent(tree.root, tree1.root));
    }
}