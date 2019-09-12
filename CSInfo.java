
//---------------------------------------------------------------------------
// CSInfo.java by Dale/Joyce/Weems Chapter 5
//
// Reads information about famous computer scientists from the file
// FamousCS.txt. Allows user to enter names and provides them the information
// from the file that matches the name.
//---------------------------------------------------------------------------
//package ch05.apps;

import java.io.*;
import java.util.*;
import ch05.collections.*;
import support.FamousPerson;

public class CSInfo
{
public static void main(String[] args) throws IOException
{
// instantiate collection
// final int CAPACITY = 300;
ArrayList<Integer> hashcodes=new ArrayList<Integer>();

// set up file reading
FileReader fin = new FileReader("input/FamousCS.txt");
Scanner info = new Scanner(fin);
info.useDelimiter("[,\\n]"); // delimiters are commas, line feeds

Scanner scan = new Scanner(System.in);
FamousPerson person;
String fname, lname, fact;
int year;

// read the info from the file and put in collection
while (info.hasNext())
{
fname = info.next(); lname = info.next();
year = info.nextInt(); fact = info.next();
person = new FamousPerson(fname, lname, year, fact);
hashcodes.add(person.hashCode());
}

sortPrint(hashcodes);

for(int i=0;i<hashcodes.size();i++)
{
   hashcodes.set(i,hashcodes.get(i)%1000);
}
  

sortPrint(hashcodes);
  
for(int i=0;i<hashcodes.size();i++)
{
   hashcodes.set(i,hashcodes.get(i)%100);
}
  
sortPrint(hashcodes);
for(int i=0;i<hashcodes.size();i++)
{
   hashcodes.set(i,hashcodes.get(i)%10);
}
  

sortPrint(hashcodes);
  
  
}
  
  
public static void sortPrint(ArrayList<Integer> hashcodes)
{
   Collections.sort(hashcodes);
   for(int i=0;i<hashcodes.size();i++)
   {
       System.out.println(hashcodes.get(i));
   }
  
}
}