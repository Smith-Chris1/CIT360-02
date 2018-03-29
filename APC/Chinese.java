 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Chinese implements Handler {
 @Override
 public void execute(int food) {
     int screen = 1;
     System.out.print("\f");
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BooksController controller = new BooksController();
        try {
            System.out.println("Chinese Foods");
     System.out.println("Kung Pow Chicken");
     System.out.println("Fried Rice");
     System.out.println("Noodles");
     System.out.println("Wagyu Beef");
     System.out.println("2 for Mexican, 3 Italian, 4 to Quit");
	     food = Integer.parseInt(read.readLine());
            controller.put(food, screen);
        } catch (Exception e) {
            System.out.println("Please select one of the listed Options!");

	 }
     
 }
}