package javaPrograms.ExceptionHandling;

public class JavaExceptionHandlingExample1 extends RuntimeException {
	String msg;
	 public JavaExceptionHandlingExample1(String msg) {
		
		this.msg = msg;
	}



	public static void vote(int age) {
		if(age>18) {
			System.out.println("you are eligible to vote");
		}
		else {
			throw new JavaExceptionHandlingExample1("you are not eligible to vote");
		}
	}
	

}

class DriverClass{
	public static void main(String[] args) {
		JavaExceptionHandlingExample1.vote(10);
	}
}
