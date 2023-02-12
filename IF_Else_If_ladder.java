import java.util.Scanner;
public class IF_Else_If_ladder {
	public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter Marks: ");
	int a = in.nextInt();
	
	if(a>90) {
		System.out.println("excellent");
	}
	else if(a>80) {
		System.out.println("Best");
	}
	else if(a>70) {
		System.out.println("Better");
	}
	else if(a>60) {
		System.out.println("Good");
	}
	else {
		System.out.println("Fail");
	}
	}
}
