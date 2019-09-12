import ch07.trees.*;
import ch02.stacks.*;
import support.*;

/*
*  Ryan Marinelli
*  Homework 7
*  Received Assistance from tutors at tutors.com and Sam Kang
*/
public class ExtendedBinarySearchTree <T> extends BinarySearchTree<T> {

/*
* @param BSTNode<T> node
* @return returns the height of the BST recursively 
*/    
   public int recursionHeight(BSTNode<T> node) {
      int left = 0;
      int right = 0;
      if (node == null) {
         return 0;
      } else {
         left = recursionHeight(node.getLeft());
         right = recursionHeight(node.getRight());
      }
      if (left >= right) {
         return 1 + left;
      } else {
         return 1 + right;
      }
   }
   
/*
* @return returns the height of the BST iteratively 
*/   
   public int iterativeHeight() {
      int left = 0;
      int right = 0;
      if (root != null) {
         LinkedStack<BSTNode<T>> nodeStack = new LinkedStack<BSTNode<T>>();
         BSTNode<T> currNode;
         nodeStack.push(root);
         while (!nodeStack.isEmpty()) {
            currNode = nodeStack.top();
            nodeStack.pop();
            if (currNode.getLeft() != null) {
               nodeStack.push(currNode.getLeft());
               left++;
            }
            if (currNode.getRight() != null) {
               nodeStack.push(currNode.getRight());
               right++;
            }
            
         }
      }
      if (left >= right) {
         return 1 + left;
      } else {
         return 1 + right;
      }
   
   }

}