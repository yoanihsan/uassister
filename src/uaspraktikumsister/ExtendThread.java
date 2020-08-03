package uaspraktikumsister;

//sudah diedit oleh chaniago

public class ExtendThread extends Thread {
	int threadNumber;
	
	public ExtendThread(int num) {
		threadNumber = num;
	}
	
	public void run() {
		System.out.println("I'm thread number : "+threadNumber);
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(threadNumber + "is finished");
		}
		System.out.println(threadNumber + "is finished!");
	}
	
	public static void main(String[] args) {
		System.out.println("Creating thread 1");
		Thread t1 = new ExtendThread(1);
		
		System.out.println("Creating thread 2");
		Thread t2 = new ExtendThread(2);
		
		t1.start();
		t2.start();
	}
}
