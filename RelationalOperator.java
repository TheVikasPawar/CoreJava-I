import java.util.Scanner;
public class RelationalOperator {
	
	public static void main(String[] args) {
		int a,b;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the First number= ");
		a = in.nextInt();
		
		System.out.print("Enter the First number= ");
		b = in.nextInt();
		
		System.out.println("True/False = "+(a<b));
		System.out.println("True/False = "+(a>b));
		System.out.println("True/False = "+(a<=b));
		System.out.println("True/False = "+(a>=b));
		System.out.println("True/False = "+(a==b));
		System.out.println("True/False = "+(a!=b));
		
		
	}

}
