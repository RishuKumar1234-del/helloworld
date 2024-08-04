package javaPrograms.starPattern;

public class FifthPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		//second way: 
		System.out.println("\n\nsecond way it can also be written as ");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
