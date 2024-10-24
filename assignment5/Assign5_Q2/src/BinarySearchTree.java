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

    public Node addNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = addNode(node.left, value);
        } else if (value > node.data) {
            node.right = addNode(node.right, value);
        }
        return node;
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    public boolean searchNode(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        } else if (key < node.data) {
            return searchNode(node.left, key);
        } else {
            return searchNode(node.right, key);
        }
    }

    public boolean search(int key) {
        return searchNode(root, key);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println(bst.search(30)); // true
        System.out.println(bst.search(90)); // false
    }
}
