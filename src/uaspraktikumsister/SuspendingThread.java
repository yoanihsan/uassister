package uaspraktikumsister;

import java.io.IOException;

public class SuspendingThread extends Thread {
    
    // Run method is executed when thread first started
    public void run(){
        int count = 1;
        System.out.print("I can count. Watch me go!!");
        for(;;){
            System.out.println(count++ + " ");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        
        Thread counter = new SuspendingThread();
        counter.start();
        System.out.println("Press any enter to SUSPEND the thread counting");
        System.in.read();
        counter.suspend();
        System.out.println("Press any enter to RESUME the thread counting");
        System.in.read();
        counter.resume();
        System.out.println("Press any enter to STOP the thread counting");
        System.in.read();
        counter.stop();
        
    }
}
