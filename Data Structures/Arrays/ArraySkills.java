import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
/*
*
@author Ryan Marinelli
*        CIS 112
*        June 9th 2019
*        
*/

public class ArraySkills {


   public static void main(String[] args) {
   
      // ***********************
      // For each item below you must code the solution. You may not use any of the
      //  methods found in the Arrays class or the Collections classes
      //
   
      String[] myData;
      
      // 1. Instantiate the given array to hold 10 Strings.
      String [] myArray = new String [10];
      
      // 2. Add your name to the Array at index 0 and a friend's name to the Array at index 4
      myArray[0] = "Ryan";
      myArray[4] = "Robie";  
          
      // 3. Move your friend's name to index 0 in the array and "delete" their name from index 4
      for(int i = 0; i <= 10; i++){
         if(i == 0)
            {
               myArray[0] = "Robie";
            }
            
         if(i == 4)
            {
               myArray[4] = "";
            }
            
        }
            System.out.print(myArray[0]);
            System.out.print(myArray[4]);
 
                       
      // 4. Fill up all of the remaining indeces in the array with more names
         myArray[1] = "Ken";
         myArray[2] = "James";
         myArray[3] = "George";
         myArray[4] = "Erik";
         myArray[5] = "Josh";
         myArray[6] = "Ashfaq";
         myArray[7] = "Chris";
         myArray[8] = "Matt";
         myArray[9] = "Frankenstein";
    
      
      // 5. Swap the values at index 5 and index 1
        String tempVar =  myArray[1];
        myArray[1] = myArray[5];
        myArray[5] = tempVar;
            
      // 6. Print the array from beginning to end.
         for(int i = 0 ; i < 10; i++){
           System.out.println(myArray[i]);
           }
           
      // 7. Shuffle the array of strings
        Random rand = new Random();
        int index = rand.nextInt(10);
        
        for(int i = 0; i < myArray.length; i++)
        {
           index = rand.nextInt(10); //By keeping the random class in the loop it generates a new int 
           myArray[i] = myArray[index]; // with each iteration of the loop 
        }
      
      // Confirms that the array was shuffled
        for(int i = 0 ; i < myArray.length; i++){
           System.out.println(myArray[i]);
           }  
           
           
        
      
      // 8. Find and print the longest and shortest Strings in the array
          String largest = "name"; 
          String smallest = "name";
    
           for(int i = 0; i < myArray.length ; i++)
           {
           // Tertiary operator allows comparison without worrying about indexing
            if(i < myArray.length - 1 || i == myArray.length  ) 
            {
             if(myArray[i].length() > myArray[i + 1].length())
             {
                largest = myArray[i];
             }
             
             else{
                  largest = myArray[i + 1]; 
                 } 
             }
           
           if(i == myArray.length)// used to avoid issues with indexing at the end of arrays
            {
             if(myArray[(myArray.length-2)].length() > myArray[(myArray.length -1)].length())
             {
                largest = myArray[myArray.length - 2];
             }
             
             else{
                  largest = myArray[myArray.length -1]; 
                 } 
             }
                           
           }
            
             System.out.println("The largest string in this array is " + largest);
            
             
           for(int i = 0; i < myArray.length ; i++)
           {
            if(i < myArray.length - 1 || i == myArray.length  )
            {
             if(myArray[i].length() < myArray[i + 1].length())
             {
                smallest = myArray[i];
             }
             
             else{
                  smallest = myArray[i + 1]; 
                 } 
             }
           
           if(i == myArray.length)
            {
             if(myArray[(myArray.length -2)].length() < myArray[(myArray.length -1)].length())
             {
                smallest = myArray[myArray.length - 2];
             }
             
             else{
                   smallest = myArray[myArray.length -1]; 
                 } 
             }
                           
           }    
           
           System.out.println("The smallest string is " + smallest);
           
      // 9. Add up the total number of characters in all of the strings in the array and print the answer
            int total = 0; 
            
            for(int i = 0; i < myArray.length; i++)
            {
               total += myArray[i].length();
                            
            }
               System.out.println(total);
   
      // 10. Prompt the user for a String and then perform a linear search of the array
      //  to see if that string is or is not in the array. Print if it is or is not found.
      Scanner keyboard = new Scanner (System.in);
      String  userinput = keyboard.nextLine();
      
      for(int i = 0; i < myArray.length; i++)
      {
         boolean value;
         value = userinput.equals(myArray[i]);
         
         if (value == true)
         {
            System.out.println("There is a match");
            
         }   
         
         else
         {
              System.out.println("Not found");
            
         }
      }
      
      // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
      // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).
     
     for(int i = 0; i <= 5; i++)
     {
         System.out.println(myArray[i]+ " is found at" + i);
        
     }
         
     for(int i = 5; i < myArray.length ; i++)
      { 
        System.out.println(myArray[i - 1] = myArray[i]);       
      }
       myArray[myArray.length-1] = null;
      
      
      
      // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
      // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.
      String [] secondArray = new String[20]; 
      
         myArray[0] = "Robie"; 
         myArray[1] = "Ken";
         myArray[2] = "James";
         myArray[3] = "George";
         myArray[4] = "Erik";
         myArray[5] = "Josh";
         myArray[6] = "Ashfaq";
         myArray[7] = "Chris";
         myArray[8] = "Matt";
         myArray[9] = "Frankenstein";
         
      for(int i = 0; i < myArray.length; i++)
      {
         secondArray[i] = myArray[i];
         System.out.println(" " + secondArray[i]);
      }   
     
       myArray = null;
      
      // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
      // If the second is larger than the first, print forward in the array from the first index to the second
    
	Scanner sc = new Scanner(System.in);
	  int len_array = secondArray.length;
      System.out.print("Please input first index from  0  to "+len_array);
      
      int firstIndex = sc.nextInt();
      System.out.print("Please input second index from  0  to "+len_array);

      int secondIndex = sc.nextInt();

         if(firstIndex < secondIndex)
         for(int i = firstIndex; i < secondIndex; i++){
              System.out.println("Element "+i+": "+secondArray[i]);
         }
         else
         for(int i = firstIndex; i >= secondIndex; i--){
                 System.out.println("Element "+i+": "+secondArray[i]);
         }
      	 
	}
}
    



