package binarytree;

public class BinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecusively(root, key);
    }

    private BinaryNode<K> addRecusively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecusively(current.left, key);
        } else {
            current.right = addRecusively(current.right, key);
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
}
