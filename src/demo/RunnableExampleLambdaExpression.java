package demo;

public class RunnableExampleLambdaExpression {
	
	public static void main(String[] args) {
		
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		System.out.println("Creating a runnable");
		Runnable runnable = () -> {
			System.out.println("Inside: " + Thread.currentThread().getName());
		};
		
		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting thread...");
		thread.start();
		
	}

}
