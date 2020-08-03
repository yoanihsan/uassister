package uaspraktikumsister;

//sedikit perubahan
public class yoanihsan {

	public Integer[] arr1 = {6,9,1,2,3,5};
	public Integer[] arr2 = {7,11,6,4,3,1};
	public Integer[] arr3 = {5,4,3,2,1,12};

	//if you want using java 8 pre lambda Runnable
	public void threadProcess(int indexOf) {
		yoanihsan obj = new yoanihsan();
		Thread t = new Thread(new Runnable() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Integer result = obj.arr1[indexOf] + obj.arr2[indexOf] + obj.arr3[indexOf];
					System.out.println("thread "+(indexOf+1)+" = "+obj.arr1[indexOf] + " + "+ obj.arr2[indexOf] + " + "+ obj.arr3[indexOf] + " = " +result);
					Thread.sleep(2000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		t.start();
	}

	//if you want using java 8 lambda runnable
	public void threadProcessLambdaRunnable(int indexOf) {
		yoanihsan obj = new yoanihsan();
		Runnable runnable = () -> { 
		    try {
				Integer result = obj.arr1[indexOf] + obj.arr2[indexOf] + obj.arr3[indexOf];
				System.out.println("thread "+(indexOf+1)+" = "+obj.arr1[indexOf] + " + "+ obj.arr2[indexOf] + " + "+ obj.arr3[indexOf] + " = " +result);
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		};
		Thread t = new Thread(runnable);
		t.start();
	}

	//if you want using java 8 lambda without runnable
	public void threadProcessLambda(int indexOf) {
		yoanihsan obj = new yoanihsan();
		Thread t = new Thread(() -> {	
			// TODO Auto-generated method stub
			try {
				Integer result = obj.arr1[indexOf] + obj.arr2[indexOf] + obj.arr3[indexOf];
				System.out.println("thread "+(indexOf+1)+" = "+obj.arr1[indexOf] + " + "+ obj.arr2[indexOf] + " + "+ obj.arr3[indexOf] + " = " +result);
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
		});
		t.start();
	}

	public static void main(String[] args) {
		yoanihsan obj = new yoanihsan();
		for(int i = 0; i < 6; i++) {
			//obj.threadProcess(i);
			obj.threadProcessLambdaRunnable(i);
			//obj.threadProcessLambda(i);
		}		
	}
}
