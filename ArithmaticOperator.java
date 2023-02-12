import java.util.Scanner;

public class ArithmaticOperator {
	public static void main(String[] args) {
	
	int a, b;
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter first number= ");
	a=in.nextInt();
	
	System.out.print("Enter Second number= ");
	b=in.nextInt();
	
	System.out.println("ADDITION IS= "+(a+b));
	System.out.println("SUBTRACTION IS= "+(a-b));
	System.out.println("MULTIPLICATION IS= "+a*b);
	System.out.println("DIVISION IS= "+a/b);
	System.out.println("REMINDER IS= "+a%b);
	
	}
}
