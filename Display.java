package multiThreadingDemo;

public class Display {
	public void print(String name) {
		for(int i =0;i<10 ;i++) {
			System.out.print("Hello ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
