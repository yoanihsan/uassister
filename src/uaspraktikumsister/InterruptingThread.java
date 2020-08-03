package uaspraktikumsister;

import java.io.IOException;

public class InterruptingThread extends Thread{

	public void run() {
		System.out.println("I am feel sleepy, wake up in eight hour");
		try {
			Thread.sleep(1000 * 60 * 60 * 8);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.err.println("Just five more minute");
		}
	}
	
	public static void main(String[] args) throws IOException {
		Thread sleepy = new InterruptingThread();
		sleepy.start();
		System.out.println("Please enter to interupt the thread");
		System.in.read();
		sleepy.interrupt();
	}
}
