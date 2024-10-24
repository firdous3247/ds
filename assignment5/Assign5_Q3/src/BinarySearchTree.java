public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        }

        // Traverse the tree to find the node to delete
        if (value < node.data) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.data) {
            node.right = deleteNode(node.right, value);
        } else {
            // Node to be deleted is found

            // Case 1: Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Case 2: Node with two children
            // Get inorder successor (smallest in the right subtree)
            node.data = minValue(node.right);

            // Delete the inorder successor
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    public int minValue(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void inorder() {
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(70);
        bst.root.left.left = new Node(20);
        bst.root.left.right = new Node(40);
        bst.root.right.left = new Node(60);
        bst.root.right.right = new Node(80);

        System.out.println("Inorder traversal before deletion:");
        bst.inorder();
        System.out.println();

        bst.delete(50);  // Node with two children

        System.out.println("Inorder traversal after deletion:");
        bst.inorder();
    }
}
