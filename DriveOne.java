import java.util.Random;

/*
*  Ryan Marinelli
*  Homework 7
*  Received Assistance from tutors at tutors.com and Sam Kang
*/

public class DriveOne {

   public static void main(String[] args) {
      Random rand = new Random();
      FullnessRatio <Integer> first = new FullnessRatio <Integer>();
      FullnessRatio <Integer> second = new FullnessRatio <Integer>();
      FullnessRatio <Integer> third = new FullnessRatio <Integer>();
      FullnessRatio <Integer> fourth = new FullnessRatio <Integer>();
      FullnessRatio <Integer> fifth = new FullnessRatio <Integer>();
      FullnessRatio <Integer> sixth = new FullnessRatio <Integer>();
      FullnessRatio <Integer> seventh = new FullnessRatio <Integer>();
      FullnessRatio <Integer> eighth = new FullnessRatio <Integer>();
      FullnessRatio <Integer> nineth = new FullnessRatio <Integer>();
      FullnessRatio<Integer> tenth = new FullnessRatio <Integer>();
      
      //Loop stores an integer between 1-3000 in the node
      for (int i = 0; i < 1000; i++) {
         first.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         second.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         third.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         fourth.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         fifth.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         sixth.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         seventh.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         eighth.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         nineth.add(rand.nextInt(3000) + 1);
      }
      for (int i = 0; i < 1000; i++) {
         tenth.add(rand.nextInt(3000) + 1);
      }
      
      
      //Changed encapsulation of root variable in the BinarySearchTree class to public
      System.out.println("The height of the first tree is " + first.recursionHeight(first.root));
      System.out.println("The fullness ratio of the first tree is " + first.fullRatio(first.root) + "\n");
      
      System.out.println("The height of the second tree is " + second.recursionHeight(second.root));
      System.out.println("The fullness ratio of the third tree is " + second.fullRatio(second.root) + "\n");
      
      System.out.println("The height of the third tree is " + third.recursionHeight(third.root));
      System.out.println("The fullness ratio of the third tree is " + third.fullRatio(third.root) + "\n");
      
   
   
   }
}