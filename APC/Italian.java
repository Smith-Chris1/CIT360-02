 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Italian implements Handler{
	 @Override
	 public void execute(int food) {
	     int screen = 3;
	     System.out.print("\f");
	     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BooksController controller = new BooksController();
        try {
        	System.out.println("Italian Foods");
	     System.out.println("Pizza");
	     System.out.println("Spagetti");
	     System.out.println("Meatballs");
	     System.out.println("Pasta");
	     System.out.println("Focaccia");
	      System.out.println("1 for Chinese, 2 for Mexican, 4 to Quit");
	     food = Integer.parseInt(read.readLine());
            controller.put(food, screen);
        } catch (Exception e) {
            System.out.println("Please select one of the listed Options!");

	 }
}
}