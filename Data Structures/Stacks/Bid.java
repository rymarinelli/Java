import ch02.stacks.LinkedStack;
import support.LLNode;
import ch02.stacks.StackUnderflowException;

public class Bid{

 private String name;
 private int amount;
 private int maxBid;
 
 /*
 @param takes name, amount, and maxBid as constructors
 @return returns the variable for the constructor
 */
 
 public Bid(String name, int amount, int maxBid){
 this.name = name;
 this.amount = amount;
 this.maxBid = maxBid;
 }
 
 /*
 @return return name for the getter
 */
 public String getName(){
 return this.name;
 }
 
 /*
 @return returns the amount from the getter
 */
 public int getAmount(){
 return this.amount;
 }
 
 /*
 @return returns the maxBid from the get method
 */
 public int getMaxBid(){
    return this.maxBid;
 }
 
  
    
      
    
  }
