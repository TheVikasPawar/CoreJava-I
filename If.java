import java.util.Scanner;
public class If{
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age= ");
		int age = in.nextInt();
		
		if(age>=18) {
			System.out.println("WOOOOOO.....!");
			System.out.println("You are eligible for voting card.");
			System.out.println("Thank You!");
		}
	}

}
