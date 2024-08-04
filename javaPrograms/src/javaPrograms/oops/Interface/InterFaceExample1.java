package javaPrograms.oops.Interface;

public interface InterFaceExample1 {
	
	public void m1();
	public void m2();
	public void m3();
	
	default void m4() {
		System.out.println("this is the concrete method inside the interface");
		
	}
	

}
