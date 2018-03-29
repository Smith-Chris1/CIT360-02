

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String superhero = request.getParameter("superhero");
        String weakness = request.getParameter("weakness");

        System.out.println("Your favorite super hero is " + superhero);
        System.out.println("His weakness: " + weakness + ", caused him to die horribly at the hands of his nemesis Casanova Frankenstein (look him up :).");

        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your favorite super hero is: " + superhero + "<br/>";
        htmlRespone += "His weakness: " + weakness + ", caused him to die horribly at the hands of his nemesis Casanova Frankenstein (look him up :).</h2>";
        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);

    }

}