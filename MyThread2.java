package multiThreadingDemo;

public class MyThread2 implements Runnable {

	
	Display display;
	String name;
	
	public MyThread2(Display display, String name) {
		this.display = display;
		this.name = name;
	}
	
	public MyThread2() {
		
	};
	
	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("From Thread Class 2 (Runnable) : "+i+" Thread Name : "+Thread.currentThread().getName());
//		}
		 display.print(name);
		 
	}
	

}
