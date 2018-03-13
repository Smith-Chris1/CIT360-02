import java.util.*;
import javax.swing.*; 

public class superHerosExamplesTest {
   public static void main(String [] args) {
      System.out.println("\f");
      JFrame frame = new JFrame("superHeroList");
      String superHeros = JOptionPane.showInputDialog(frame, "Please enter your favorite superheros (as many as you want) seperated by commas.");
      List<String> superHeroList = Arrays.asList(superHeros.split(","));
      int listCount = superHeroList.size();
      System.out.println("The length of the array is: " + listCount+"\n");
      System.out.println("This is the array:" + superHeroList+"\n");
      System.out.println( "Here are my favorite Super Heros in order.\n" ); 
      int count = 0;
      if (superHeros.isEmpty()){
         System.out.println("superHeros is empty");
      } else {
      do {
            System.out.println("Hero " + (count+1) + ": " + superHeroList.get(count));
            count++;
        } while (count < listCount);
    }
   }
}
