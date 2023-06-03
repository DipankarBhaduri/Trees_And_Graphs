package trees.binarySearchTree;

import trees.binarySearchTree.BinarySearchTreeNode;

public class BuildBinarySearchTree {
    public BinarySearchTreeNode buildBinarySearchTree (BinarySearchTreeNode root , int val ){
        BinarySearchTreeNode node ;
        if ( root == null ){
            node = new BinarySearchTreeNode(val) ;
            return node ;
        }

        if ( root.data > val ){
            root.left = buildBinarySearchTree(root.left , val) ;
        } else {
            root.right = buildBinarySearchTree(root.right , val) ;
        }
        return root ;
    }
}