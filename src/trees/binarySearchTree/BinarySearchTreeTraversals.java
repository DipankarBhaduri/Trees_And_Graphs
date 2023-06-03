package trees.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeTraversals {

    public void preOrderTraversalOfABinarySearchTree ( BinarySearchTreeNode root ){
        if ( root == null ){
            return ;
        }
        System.out.print(root.data+" ");
        preOrderTraversalOfABinarySearchTree(root.left);
        preOrderTraversalOfABinarySearchTree(root.right);
    }

    public void inOrderTraversalOfABinarySearchTree ( BinarySearchTreeNode root ){
        if ( root == null ){
            return ;
        }
        inOrderTraversalOfABinarySearchTree(root.left);
        System.out.print(root.data+" ");
        inOrderTraversalOfABinarySearchTree(root.right);
    }

    public void postOrderTraversalOfABinarySearchTree ( BinarySearchTreeNode root ){
        if ( root == null ){
            return ;
        }
        postOrderTraversalOfABinarySearchTree(root.left);
        postOrderTraversalOfABinarySearchTree(root.right);
        System.out.print(root.data+" ");
    }


    public void levelOrderTraversalOfABinarySearchTree ( BinarySearchTreeNode root ){
        Queue< BinarySearchTreeNode > q = new LinkedList<>() ;
        q.add(root) ;
        q.add(null) ;

        while ( !q.isEmpty()) {
            BinarySearchTreeNode currentNode = q.remove() ;
            if ( currentNode == null ){
                if ( q.isEmpty()){
                    break;
                } else {
                    System.out.println();
                    q.add(null) ;
                }
            } else {
                System.out.print(currentNode.data+" ");
                if ( currentNode.left != null ){
                    q.add(currentNode.left) ;
                }
                if ( currentNode.right != null ){
                    q.add(currentNode.right) ;
                }
            }
        }
    }
}
