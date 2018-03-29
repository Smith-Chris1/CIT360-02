 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Mexican implements Handler{
	 @Override
	 public void execute(int food) {
	     int screen = 2;
	     System.out.print("\f");
	     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BooksController controller = new BooksController();
        try {
            System.out.println("Mexican Foods");
	     System.out.println("Spanish Rice");
	     System.out.println("Taco");
	     System.out.println("Burritos");
	   System.out.println("1 for Chinese, 3 for Italian, 4 to Quit");
	     food = Integer.parseInt(read.readLine());
            controller.put(food, screen);
        } catch (Exception e) {
            System.out.println("Please select one of the listed Options!");

	 }
}
	
}