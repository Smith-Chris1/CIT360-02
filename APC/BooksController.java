 


import java.util.HashMap;

public class BooksController {
    public static HashMap<Integer, Handler> foods = new HashMap<Integer, Handler>();

    public static void put(int food, int screen){
        if (screen == 0) {
            foods.put(1, new Chinese());
            foods.put(2, new Mexican());
            foods.put(3, new Italian());

        Handler handler = foods.get(food);
        handler.execute(food);
    };
        if (screen == 1) {
            foods.put(2, new Mexican());
            foods.put(3, new Italian());
            foods.put(4, new Quit());

        Handler handler = foods.get(food);
        handler.execute(food);
    }
        if (screen == 2) {
            foods.put(1, new Chinese());
            foods.put(3, new Italian());
            foods.put(4, new Quit());

        Handler handler = foods.get(food);
        handler.execute(food);
    }
    if (screen == 3) {
        foods.put(1, new Chinese());
        foods.put(2, new Mexican());
        foods.put(4, new Quit());

        Handler handler = foods.get(food);
        handler.execute(food);
    }
}
}