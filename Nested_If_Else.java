import java.util.Scanner;
public class Nested_If_Else {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1:");
		int a = in.nextInt();
		System.out.println("Enter 1:");
		int b = in.nextInt();
		System.out.println("Enter 1:");
		int c = in.nextInt();
		System.out.println("Greater number is");
		if (a>b) {
			if (a>c) {
				System.out.println("a"+a);
			}
			else {
				System.out.println("c"+c);
			}
		} 
		
		else {
			if (b>c) {
				System.out.println("b"+b);
			}
			else {
				System.out.println("c"+c);

			}
		}
		
	}

}
