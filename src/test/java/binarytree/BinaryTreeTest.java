package binarytree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void givenNumberAddedToBinaryTreeReturnSize() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}
