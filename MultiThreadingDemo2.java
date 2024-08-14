package multiThreadingDemo;

public class MultiThreadingDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Display display = new Display();
		MyThread2 mt2_0 = new MyThread2(display, "Arjun");
		MyThread2 mt2_1 = new MyThread2(display, "luffy");
		MyThread2 mt2_2 = new MyThread2(display, "Aju");
		
		Thread t = new Thread(mt2_0);
		
		Thread t1 = new Thread(mt2_1);
		
		t.start();
		//t.join();
		t1.start();
	}

}
