/*
   PropertyTax.java
   Ryan Marinelli
   04 December 2018
   Question 4
   Problem asks to calculate the assessed value of properties
*/

import javax.swing.*;
import java.awt.event.*;

/*
   PropertyTax.java
   Ryan Marinelli 
   04 December 2018
   Question 4
   This class provides the asssed value and tax paid on properties.
*/

public class Propertytax
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Property tax Calculator");
    JButton button = new JButton("Click to enter the property's actual value");
    button.addActionListener(new ActionListener()
    {
/*    Method performs calculation based on user input.
      @param ActionEvent 
*/      
        public void actionPerformed(ActionEvent ae)
        {
            String str = JOptionPane.showInputDialog(null, "Enter the actual value : ", "The actual value of the property is ", 1);
            if(str != null)
            {
                String num = str.replaceAll(",","");
                Float val = 0.0f;
                if(!str.equals(""))
                {
                 val = Float.valueOf(num);
                }
                float aValue = 0.6f * val; 
                float tax = (aValue * 0.64f)/100 ;
               
                JOptionPane.showMessageDialog(null, "Actual value of property : " + val + "\n\n The ssessed value is : " + aValue + "\n\n The amount of tax paid : " + tax , "Your results", 1);
            }
            else
            JOptionPane.showMessageDialog(null, "Thank you for using the calculator!");
        }
    });
   
  JPanel panel = new JPanel();
  panel.add(button);
  frame.add(panel);
  frame.setSize(400, 200);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}
