package demo;

public class RunnableExampleAnonymousClass {
	
	public static void main(String[] args) {
		
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		System.out.println("Creating a runnable");
		Runnable runnable = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Inside: " + Thread.currentThread().getName());
			}
		};
		
		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting thread...");
		thread.start();
		
	}

}
