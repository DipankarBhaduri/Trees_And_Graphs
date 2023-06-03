package trees.binarySearchTree;


public class BinarySearchTreeMain {
    public static void main(String[] args) {

        // Necessary Codes :
         int [] nodes = { 8 , 4 , 6 , 5 ,7 ,2 ,3 ,1 ,10 ,11 ,12 } ;
         BinarySearchTreeNode root = null ;
         BuildBinarySearchTree buildTree = new BuildBinarySearchTree() ;
         for ( int i = 0 ; i < nodes.length ; i++ ){
             root = buildTree.buildBinarySearchTree( root , nodes[i]) ;
         }
         BinarySearchTreeEasyProblems binarySearchTreeEasyProblems = new BinarySearchTreeEasyProblems() ;


         // Current Method code :
         int smallestNumber = binarySearchTreeEasyProblems.largestElementInBinarySearchTree(root) ;
         System.out.println(smallestNumber);
    }
}