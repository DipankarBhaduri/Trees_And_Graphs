package trees.binarySearchTree;

public class BinarySearchTreeEasyProblems {
    public boolean findTargetInBinarySearchTree ( BinarySearchTreeNode root , int target ){
        if ( root == null ){
            return false ;
        }
        if ( root.data == target ){
            return true ;
        }
        if ( root.data > target ) {
            return findTargetInBinarySearchTree(root.left, target);
        } else {
           return findTargetInBinarySearchTree(root.right , target);
        }
    }


    public int smallestElementInBinarySearchTree ( BinarySearchTreeNode root ){
        if ( root.left != null ){
            return smallestElementInBinarySearchTree(root.left) ;
        } else return root.data ;
    }

    public int largestElementInBinarySearchTree ( BinarySearchTreeNode root ){
        if ( root.right != null ){
            return largestElementInBinarySearchTree(root.right) ;
        } else return root.data ;
    }
}
