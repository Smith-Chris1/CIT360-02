 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppController {   
    public static void main(String[] args) throws IOException {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BooksController controller = new BooksController();
        int screen = 0;
        try {
            System.out.println("Ethnic Foods!");
            System.out.println("What kind of ethnic foods do you like?");
            System.out.println("1 for Chinese");
            System.out.println("2 for Mexican");
            System.out.println("3 for Italian");

            int food = Integer.parseInt(read.readLine());
            controller.put(food, screen);
        }
        catch (Exception e){
            System.out.println("Please select one of the listed Options!");
            int food = Integer.parseInt(read.readLine());
            controller.put(food, screen);
        }
        
    }
}