package uaspraktikumsister;

public class RunnableThread implements Runnable{
	
	public static void main(String[] args) {
		System.out.println("Creating runnable object");
		
		Runnable runnable = new RunnableThread();
		
		System.out.println("Creating first thread");
		Thread t1 = new Thread(runnable);
		
		System.out.println("Creating second thread");
		Thread t2 = new Thread(runnable);
		
		System.out.println("Start thread");
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am an instance of the java.lang.Runnable interface");
	}
}
