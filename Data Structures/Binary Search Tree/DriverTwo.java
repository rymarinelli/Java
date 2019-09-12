import java.util.Random;

/*
*  Ryan Marinelli
*  Homework 7
*  Received Assistance from tutors at tutors.com and Sam Kang
*/

public class DriverTwo {

   public static void main(String[] args) {
      
      Random rand = new Random();
      FullnessRatio <Integer> first = new FullnessRatio<Integer>();
      FullnessRatio <Integer> second = new FullnessRatio<Integer>();
      FullnessRatio <Integer> third = new FullnessRatio<Integer>();
      FullnessRatio <Integer> fourth = new FullnessRatio<Integer>();
      FullnessRatio <Integer> fifth = new FullnessRatio<Integer>();
      
      final double k = .10;
      
      for (int i = 0; i < 1000; i++) { //creates a 1000 nodes
         if (Math.random() < k) { //10% Chance of being 42
            first.add(42);
            i++;
         } else {
            first.add(rand.nextInt(3000) + 1); // 1-k chance of being a value between 1-3000
            i++;
         }
      }
      
      for (int i = 0; i < 1000; i++) {
         if (Math.random() < (k + 0.10)) { //20% Chance
            second.add(42);
            i++;
         } else {
            second.add(rand.nextInt(3000) + 1);
            i++;
         }
      }   
         
      for (int i = 0; i < 1000; i++) {
         if (Math.random() < (k + 0.20)) { //30% Chance
            third.add(42);
            i++;
         } else {
            third.add(rand.nextInt(3000) + 1);
            i++;
         }
      }      
      
      for (int i = 0; i < 1000; i++) {
         if (Math.random() < (k + 0.30)) { //40% Chance
            fourth.add(42);
            i++;
         } else {
            fourth.add(rand.nextInt(3000) + 1);
            i++;
         }
      }     
       
      for (int i = 0; i < 1000; i++) {
         if (Math.random() < (k + 0.40)) {//50% Chance
            fifth.add(42);
            i++;
         } else {
            fifth.add(rand.nextInt(3000) + 1);
            i++;
         }
      }    
      
      ////Changed encapsulation of root variable in the BinarySearchTree class to public     
      System.out.println("The height of the first tree is " + first.recursionHeight(first.root));
      System.out.println("The fullness ratio of the first tree is " + first.fullRatio(first.root) + "\n");
      
      System.out.println("The height of the second tree is " + second.recursionHeight(second.root));
      System.out.println("The fullness ratio of the third tree is " + second.fullRatio(second.root) + "\n");

      System.out.println("The height of the third tree is " + third.recursionHeight(third.root));
      System.out.println("The fullness ratio of the third tree is " + third.fullRatio(third.root) + "\n");

      System.out.println("The height of the fourth tree is " + fourth.recursionHeight(fourth.root));
      System.out.println("The fullness ratio of the fourth tree is" + fourth.fullRatio(fourth.root) + "\n");

      System.out.println("The height of the fifth tree is " + fifth.recursionHeight(fifth.root));
      System.out.println("The fullness ratio of the fifth tree is" + fifth.fullRatio(fifth.root) + "\n");

   
   }
}
