import java.util.*;


public class CollectionLists {

    public static void main(String[] args) {
        System.out.println("\fHere are streaming protocols I deal with daily.");
          List streamingProtocol = new ArrayList();  
          streamingProtocol.add("HLS");           
          streamingProtocol.add("RTMP");
          streamingProtocol.add("RTP");
          streamingProtocol.add("MSS");
          streamingProtocol.add("RTSP");
          System.out.println(streamingProtocol + "\n");    
        
          System.out.println("I deal with framenumbers and conversions to timecode as well.");
          ArrayList<Integer> frameNumber = new ArrayList<Integer>();
          
          frameNumber.add(11242);
          frameNumber.add(231242);
          frameNumber.add(671242);
          frameNumber.add(1032);
          frameNumber.add(84353);
          
          System.out.println("Third item in the framenumber array is: " + frameNumber.get(3));
          
          System.out.println("\nDisplaying all the frame numbers in the array in timecode format (hh:mm:ss:ff): ");

          for(int i = 0; i < frameNumber.size(); i++){
                int totalSecs = (int)(frameNumber.get(i) / 29.97);
                int hours = (int) totalSecs / 3600;
                int minutes = (int)(totalSecs % 3600) / 60;
                int seconds = (int)totalSecs % 60;
                String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
              System.out.println(frameNumber.get(i) + " - " + timeString);
          }
        

          frameNumber.remove(frameNumber.size() - 1);
        
          frameNumber.remove(0);
        
          System.out.println("\nI've removed the first and last item in the array: ");

          for(Integer value: frameNumber) {
              System.out.println("Displaying the 2nd number to the 2nd to last number: " + value);
          }
          

       }
}
          