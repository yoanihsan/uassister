package uaspraktikumsister;

public class WaitingThread extends Thread{
    
    public void run(){
        System.out.println("This thread feels a little ill....");
        // Sleep for five seconds
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        // Create and start dying thread
        Thread dying = new WaitingThread();
        dying.start();
        
        // prompt user and wait for input
        System.out.println("Waiting for thread death");
        
        // wait till death
        dying.join();
        System.out.println("thread has died");
        
    }
}
