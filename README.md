# FS111-ASSIGNMENT-3
Serialization.java:
1. Write a java program, how to implement serialization for a given object. Use required classes and process to complete the serialization.
 
   for example take Customer(id, name, contactNo and address) class, use should write the java code, how to serialize Customer object to JavaObject.txt file.
 
Syncronization.java:
2. Write a java program to implement synchronization, write clear java coding steps how to do synchronization with java thread objects.
ANS: Steps for Synchronization in Java Threads:
1.Create a Shared Resource Class (Counter):

2.Create a class (Counter in this example) that represents the shared resource.
This class contains methods that need to be synchronized.
Synchronize Methods:

In the shared resource class (Counter), mark the methods that access shared data with the synchronized keyword.
In this example, increment() and getCount() methods are synchronized.
3.Create Thread Class (MyThread):

Create a class (MyThread in this example) that extends Thread or implements Runnable.
This class will have a reference to the shared resource (Counter in this example).
Access Shared Resource Safely:

In the run() method of the thread class, call the synchronized methods of the shared resource.
In this example, the run() method of MyThread calls the increment() method of Counter.
Create and Start Threads:

In the main method, create instances of the thread class (MyThread).
4. Pass the shared resource (Counter) to each thread during creation.
Start Threads:

5. Call start() method on each thread object to start the execution of threads.
Join Threads:

6. Optionally, call join() on each thread object to wait for threads to complete execution.
This ensures that the main thread waits for all other threads to finish before continuing.
Access Final Result:

7. After threads complete execution, access the final result or state of the shared resource.
In this example, main method prints the final value of the counter after threads finish.

3.What is abstraction in java, how many ways can we implement abstraction, write proper java program and how to implement abstraction.
   ANS:Abstraction in Java is a concept where we hide the complex implementation details of a class and only show the necessary features or behaviors to the outside world. It allows us to focus on what an object does rather than how it does it. In Java, there are two main ways to implement abstraction:

Abstract Classes
Interfaces
1. Abstract Classes:
An abstract class in Java is a class that cannot be instantiated and can contain abstract methods as well as concrete methods. Abstract methods define the structure of a method but leave the implementation to the subclasses.
2. Interfaces:
An interface in Java is a reference type similar to a class, but it contains only abstract methods, default methods, and static methods. It is a way to achieve full abstraction because it only defines what a class must do, not how it should do it. A class can implement multiple interfaces.

