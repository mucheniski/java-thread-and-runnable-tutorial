package demo;

public class ThreadSleepExample {

	public static void main(String[] args) {
		
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		String[] messages = {
				"If i can stop one heart from breaking.",
				"I shall not live in vain.",
				"If i can ease one live the aching",
				"Or cool one pain",
				"Or help one faithing robin",
				"Unto his nest again",
				"I shall not live in vain"
		};
		
		
		Runnable runnable = () -> {
			
			System.out.println("Inside: " + Thread.currentThread().getName());
			
			for (String message : messages) {
				System.out.println(message);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					throw new IllegalArgumentException(e);
				}
			}			
		};		
		
		Thread thread = new Thread(runnable);
		thread.start();
		
	}
	
}
