package binarytree;

public class BinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }



    public int getSize() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(BinaryNode<K> current) {
        return  current == null ? 0 : 1 + this.getSizeRecursively(current.left)
                                        + this.getSizeRecursively(current.right);
    }

    public void printInOrder() {
        System.out.println("\nInorder Print");
        if (this.root != null)
            inOrder(this.root);
        else
            System.out.println("Tree is empty");
    }

    private void inOrder(BinaryNode<K> current) {
        if (current != null) {
            inOrder(current.left);
            System.out.println(current.key);
            inOrder(current.right);
        }
    }

    public void printPreOrder() {
        System.out.println("\nPreorder Print");
        if (this.root != null)
            preOrder(this.root);
        else
            System.out.println("Tree is empty");
    }

    private void preOrder(BinaryNode<K> current) {
        if (current != null) {
            System.out.println(current.key);
            inOrder(current.left);
            inOrder(current.right);
        }
    }

    public void printPostOrder() {
        System.out.println("\nPostorder Print");
        if (this.root != null)
            postOrder(this.root);
        else
            System.out.println("Tree is empty");
    }

    private void postOrder(BinaryNode<K> current) {
        if (current != null) {
            inOrder(current.left);
            inOrder(current.right);
            System.out.println(current.key);
        }
    }
}
