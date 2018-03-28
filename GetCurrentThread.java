

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GetCurrentThread implements Runnable {
    
    
    
  Thread th;
  
  public GetCurrentThread(String threadName) {
    th= new Thread(this,threadName);
    th.start();
    
    
  }

  public void run() {
    System.out.println(th.getName()+" is starting.....");
    System.out.println("Current thread name : "+
    Thread.currentThread().getName());
  }

  public static void main(String args[]) {
    System.out.println("Current thread name : "+
    Thread.currentThread().getName());
    new GetCurrentThread("1st Thread");
    new GetCurrentThread("2nd Thread");
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    executorService.execute(new Runnable() {
    public void run() {
        System.out.println("Asynchronous task");
    }
    });
    executorService.shutdown();
    new GetCurrentThread("3rd Thread");
  }
}
