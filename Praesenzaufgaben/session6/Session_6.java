package session6;

public class Session_6 {
	//Exercise 1 Java Threading and I/O Concepts
	
	//Which of the following approaches are valid for creating and running a new thread in Java?
	//Extend Thread or implement Runnable
	
	//What characterizes a class or method as thread-safe?
	//It guarantees correct behavior when accessed concurrently by multiple threads, typically by managing access to shared state.
	
	//How do Thread.sleep(n) and Thread.yield() differ in terms of their handling ofCPU resources?
	// sleep(n) pauses the thread for n milliseconds without freeing any resources; yield() frees resources so another thread can run.
	
	//Which of the following is not required for a deadlock to occur
	// Resource preemption is not required.
	
	//Which methods are commonly used to coordinate producer and consumer threads on a shared object?
	//wait() / notify() (or notifyAll())
	
	//Which of these classes is designed for efficient reading of the text data line by line via a character stream?
	//BufferedReader (line by line text reading)
	
	//What is the purpose of the JUnit @BeforeEach annotation?
	//Runs before each individual test method
	
	//Which of the following are part of Java's byte-stream I/O classes?
	//FileOutputStream, PipedInputStream, BufferedInputSTream
	
	//Which kinds of methods should typically be synchronized to prevent race conditions in shared objects
	// Instance methods that update variables requiring consistency
	
	//Which annotations can be used to provide input to a parameterized test in JUnit 5?
	//@CsvFileSource, @ValueScore, @EnumSCore(sind z.B feste Werte wie Monate oder Jahreszeiten) 
 
}
