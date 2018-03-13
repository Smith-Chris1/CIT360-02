import java.awt.GridLayout;
import javax.swing.*; 
import java.net.*;
import java.io.*;

public class SystemTest 
{

        public static void main(String[] args) throws IOException 
        {
            JFrame frame = new JFrame("System Level Tests");
            int numeral = Integer.parseInt(JOptionPane.showInputDialog(frame, "Multiply any number by 456. Please enter a number: "));
            
            try {
            int result = (numeral * 456);
            JOptionPane.showConfirmDialog(frame, "The result is: ".concat(Integer.toString(result)));
            System.out.print(result);
            } catch (Exception e) {
                System.out.print("Can't multiply a string to an integer.");
                System.exit(0);
            }

            System.exit(0);

        }
}


