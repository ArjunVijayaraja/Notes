package multiThreadingDemo;

public class MultiThreadingDemo {
	
	//Each process/processor is called as a Thread
	//Multiple Threading will call - TIME SLICE ALGORITHM
	//If the CPU has only one Core - Only one thread is possible / if it is a multi-core processor then multi-threading is possible
	
	//Thread can be created in two ways -
	//	1. By creating a thread class which extends Thread class (public class myThread extends Thread)
			// It has a run() method -- what ever logic is written inside the run method (it will be executed).
	//	2. By creating a thread class which implements Runnable interface
	
	public static void main(String[] args) throws InterruptedException {
		//Thread.sleep(2000);
		
		
		System.out.println("Hello World");
		MyThread1 myThread1 = new MyThread1();
		//myThread1.yield(); 
		
		
		//It is possible to provide PRIORITY for a THREAD -> priority ranges from 1 to 10 [10 -Maximun, 1-Min Value]
		//But since there are multiple cores in our machine -- all other threads will be executed simultaneously -> the Thread Priority is applicable only when we have a Single Processor
		//myThread1.setPriority(10);//vid time 02.22.17
		
		myThread1.start();  // When the Start method is called -> a new child thread will be created 
		//-- So two thread will be present 1. main thread and the other is Child Thread-- The two threads will be running at the same time 
		//myThread1.run();// When the run method is called - First all the methods inside the run method will be executed and then the main method will be executed.		
		//When we call the .start() method -> A new Thread will be started. --> And the content given inside the run() method will be executed
		
		myThread1.mt = Thread.currentThread();
		
		//myThread1.join();  //myThread.join()  -> normally all the threads will be executed randomly. -> if want to control the threads 
						// It is possible by using Thread.join() method. -> so due to this once the thread operation is completed successfully the next thread will be started.
		
		
		//This is the second way to create a Thread - (Using the Runnable Interface) here when the IRunnable thread should be passed to an instance of a thread object as shown below;
		MyThread2 mythread2 = new MyThread2();
		Thread thread = new Thread(mythread2);
		
		
		
		thread.start();
		//thread.join(); 
		
		//Thread.currentThread.getName() -> will print the name of the current thread 
		//Thread.currentThread().setName("AJU"); -> used to provide a name for a thread
		//Thread.currentThread().setName("AJU");
		
		
		
	
	
		for(int i=0;i<10;i++) {
			System.out.println("From Main Thread : "+i+" Thread Name : "+Thread.currentThread().getName());
		}
		
		
		
	}

}
