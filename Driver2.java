import java.util.Scanner;

public class Driver2{
public static void main (String args []){
Scanner sc = new Scanner(System.in);
EvenNumber num = new EvenNumber();

int test; 

System.out.println("Please input an integer is that is positive");
test  = sc.nextInt();

System.out.print(test.numEvens());

  }
  
}