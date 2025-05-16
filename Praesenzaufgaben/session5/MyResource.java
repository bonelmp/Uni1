package session5;

public class MyResource implements AutoCloseable {
	// Multiple Choice
	// A. try-with-resources ensures that resources are closed automatically, even
	// if an exception is thrown (true)
	// B. To be used in a try-with-resources block, a class must implement the
	// AutoCloseable interface (true)
	// C. Classes that have a close() method can always be used in
	// try-with-resources, even without AutoCloseable. (false)
	// D. AutoCloseable is used to let the JVM know how to close resources
	// automatically (true)

	public void doSomething() {
		System.out.println("Doing something");
	}

	public void close() {
		System.out.println("Resource closed");
	}

	public static void main(String[] args) {
		try (MyResource res = new MyResource()) {
			res.doSomething();
		} catch (Exception e) {
			System.out.println("Caught exception");
		}
	}
	//Which statement is correct?
	// A. The resource is automatically closed after the try block, even if an exception is thrown. (true)
	// C. MyResource only works in try-with-resources if it implements AutoCloseable (true)

	//In the context of Java's try-catch-finally construct, which of the folloeing statements are correct?
	//A. The finally block is executed whether or not an exception is thrown
	//C. The finally block is typically used to clean up resources. (Merken finally Block wird nie übersprungen)
	
	
	//What can be said about checked exceptions in Java?
	//B. They must be either caught or declared using throws
	//C. They are ignored at compile time.
	
	//Which of these scenarios would violate the Interface Segregation Principle (ISP)
	//A. Forcing a class to implement a method it doesn't use.
	//C. Using a large interface that applies partially to some classes.
	
	//Which of the following is an example of defensive programming?
	// C. Checking for null before calling .equals()

}
