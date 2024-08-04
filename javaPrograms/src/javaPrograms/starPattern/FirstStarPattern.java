package javaPrograms.starPattern;

public class FirstStarPattern {

	public static void main(String[] args) {
		System.out.println("1.following is the upper right angled triangle");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*" +" ");
				
				
			}
			System.out.println();
			
		}
		System.out.println("\n\n2.following is the reverse right angled triangle");
		for(int i=5;i>=1;i--) {
			
			for(int j=i;j>=1;j--) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n3.following is the combined  triangles");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*" +" ");
				
				
			}
			System.out.println();
			
		}
	for(int i=5;i>=1;i--) {
			
			for(int j=i-1;j>=1;j--) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		
		
	}

}
