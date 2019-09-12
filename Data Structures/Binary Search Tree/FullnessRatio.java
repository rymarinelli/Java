import ch07.trees.*;
import support.*;

/*
*  Ryan Marinelli
*  Homework 7
*  Received Assistance from tutors at tutors.com and Sam Kang
*/

public class FullnessRatio<T> extends BinarySearchTree<T> {

/*
* @param BSTNode<T> node
* @return returns the height of the tree recursively
*/
   public int recursionHeight(BSTNode<T> node) {
      if (node == null) {
         return 0;
      } else {
         int left = recursionHeight(node.getLeft());
         int right = recursionHeight(node.getRight());
      
         if (left >= right) {
            return 1 + left;
         } else {
            return 1 + right;
         }
      }
   }

/*
* @param BSTNode<T> root
* @return returns the fullness ratio recursively
*/   
      
   public double fullRatio(BSTNode<T> root) {

      if (root == null) {
         return 0;
      } else {
         double left = recursionHeight(root.getLeft());
         double right = recursionHeight(root.getRight());
         if (left <= right) {
            return (1 + left)/recursionHeight(root);
         } else {
            return (1 + right)/recursionHeight(root);
         }
      }
   }
}
