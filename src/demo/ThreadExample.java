package demo;

public class ThreadExample extends Thread {
	
	// Run method contains the code that is executed by the thread.
	@Override
	public void run() {
		System.out.println("Inside run: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main: " + Thread.currentThread().getName());
		
		System.out.println("Creating Thread...");
		Thread thread = new ThreadExample();
		
		System.out.println("Starting Thread...");
		thread.start();
	}

}
