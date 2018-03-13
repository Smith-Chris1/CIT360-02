import org.json.simple.JSONObject;


/**
 * @author Chris Smith
 */

public class json {

    public static void main(String[] args) {


        try {

            JSONObject obj = new JSONObject();
            obj.put("firstName","Julias");
            obj.put("lastName","Ceasar");
            obj.put("email","js@gmail.com");
            obj.put("address","555 n 333 e");
            obj.put("city","Springfield");
            obj.put("state","Any State");
            obj.put("zip","86677");
            obj.put("bDay","5/5/43");
            obj.put("weekday","Tuesday");
            obj.put("tod","9:23pm MST");
            obj.put("UTC","UTC Time + timezone offset");
            obj.put("sunrise","Sunrise time");
            String name = obj.get("firstName") + " " + obj.get("lastName");
            String email = (String) obj.get("email");
            String address = obj.get("address") + "\n" + obj.get("city") + " " + obj.get("state") +", " + obj.get("zip");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Address: " + address);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}