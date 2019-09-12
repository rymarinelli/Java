import java.util.Scanner;
/*
* Ryan Marinelli
* CIS 112
* Received gudidance from tutors at tutor.com
*/

public class Auction{
  public static void main (String [] args){
    ExtendedLinkedStack<Bid> bidList = new  ExtendedLinkedStack<Bid> ();
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Please enter the bidder's name (end to exit): ");
    String bidder = sc.nextLine();
    Bid bid = null;
    
    while(! bidder.equalsIgnoreCase("end") ) {
	    System.out.println("What is the value of your bid?");
    	int maxBid = Integer.parseInt(sc.nextLine());
 
        if(bidList.isEmpty()){
            bid = new Bid (bidder, 10 , maxBid);
        	  bidList.push(bid);   
        }
        else {
            Bid previous = bidList.top();        
            if(maxBid > previous.getMaxBid())// If each node at the top of the stack is less than the current bid
            {
            	bid = new Bid (bidder, previous.getMaxBid() + 1 , maxBid);
                bidList.push(bid);
            }
          	else if (maxBid > previous.getAmount()) {
            	bid = new Bid (previous.getName(), maxBid , previous.getMaxBid());
                bidList.push(bid);              
            }
        }          
        System.out.println("Please enter the bidder's name (end to exit): ");
         bidder = sc.nextLine();
      } 
        while(!bidList.isEmpty()){
           bid = bidList.top(); 
           System.out.print("The bid of " + bid.getName() + " is " + bid.getMaxBid() + " .\t");
           bidList.pop();
           
        }    

    
  }
  
  
    
      
    
  }
