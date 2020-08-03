package uaspraktikumsister;

import java.io.IOException;

public class StoppingThread extends Thread{
	public void run() {
		int count = 1;
		System.out.println("I can count. Watch me go!");
		
		for(;;) {
			System.out.println(count++ +" ");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Thread counter = new StoppingThread();
		counter.start();
		System.out.println("Please enter to interupt the thread");
		System.in.read();
		counter.stop();
	}
}
