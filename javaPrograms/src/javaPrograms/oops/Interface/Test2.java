package javaPrograms.oops.Interface;

//Java program to demonstrate Implementation of
//functional interface using lambda expressions

class Test2 {
 public static void main(String args[])
 {

     // lambda expression to create the object
//     new Thread(() -> {
//         System.out.println("New thread created");
//     }).start();
	 new Thread(()->{
		 System.out.println("i am checking new thread creation by using anonymous class");
	 }).start();;
	
 }
}
