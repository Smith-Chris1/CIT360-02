import java.awt.GridLayout;
import javax.swing.*; 
import java.net.*;
import java.io.*;

public class Http 
{

        public static void main(String[] args) throws IOException 
        {
            JFrame frame = new JFrame("httpURLConnection");
            String userUrl = JOptionPane.showInputDialog(frame, "Please enter a URL");
            System.out.printf("The url is '%s'.\n", userUrl);

           //this loads the website html code into a variable and displays it
            URL url = new URL("http://".concat(userUrl));
            HttpURLConnection conn = ( HttpURLConnection ) url.openConnection ();
            conn.setFollowRedirects(true);
            conn.setRequestMethod ("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
            int code = conn.getResponseCode() ;
            System.out.println(code);
            try {
            if (code == 200 || code == 201 || code == 202) {
            BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buff.readLine();
            while (s != null)
                {
                    System.out.println(s);
                    s = buff.readLine();
                }
            }
           // this attempts to load a page that doesn't exist and shows the code for the page not found
            if (code == 404 || code == 400 || code == 401 || code == 403) {
                System.out.print("Failed: Page does not exist\n");
            }
            if (code == 503) {
                System.out.print("Could not resolve host name.\n");
            }
            if (code == 301 || code == 302 || code == 303 || code == 303) {
                System.out.print("This website must have moved.\n");
            }
            } catch (java.net.UnknownHostException e) {
                System.out.println("Unknown Host Ex\n");
            }
        }
        }


