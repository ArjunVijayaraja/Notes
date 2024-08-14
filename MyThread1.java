package multiThreadingDemo;

public class MyThread1 extends Thread {
	
	static Thread mt;
	
	
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("From Thread Class (Extends Thread) : "+i+" Thread Name : "+Thread.currentThread().getName());
		}
		
	}

}
