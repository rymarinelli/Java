 
public class Recursion{

  public int sum(int n){
    if(n == 1)
    {
     return (1);
    }
    else{
     return n + sum(n-1);
    }
    
  }

  public int biPower(int n){
    if(n==0)
    {
     return (1);
    }
    else{

     return 2*biPower(n-1);
    }
  }

  public int timesFive(int n){
    if(n == 1)
    {
     return 5;
     }
     else{
          return 5*(n-1);
       }

    } 

}


