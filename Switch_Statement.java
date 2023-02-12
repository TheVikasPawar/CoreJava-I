		/*	Calculator	*/

import java.util.Scanner;
public class Switch_Statement {
	public static void main(String[] args) {
		double c = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		double a = in.nextDouble();
		
		System.out.println("Enter Opearator[+ = * / %]: ");
		char op = in.next().charAt(0);
		
		System.out.println("Enter the Second Number: ");
		double b = in.nextDouble();
		
		switch(op) {
		
		case '+':
			c=a+b;
			break;
			
		case '-':
			c=a-b;
			break;
			
		case '*':
			c=a*b;
			break;
			
		case '/':
			c=a/b;
			break;
			
		case '%':
			c=a%b;
			break;
			
		case '^':
			c=a*a;
		
		default:
			System.out.println("Something Wrong.");
		}
		System.out.println(a);
		System.out.println(op);
		System.out.println(b);
		System.out.println("------------------");
		System.out.println("Total= "+c);
		
	}

}
