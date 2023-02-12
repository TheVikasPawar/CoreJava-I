import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number= ");
	
	int a = in.nextInt();
	
	if(a>0) {
		System.out.println(a+" is a Positive Number.");
	}
	else {
		System.out.println(a+" is a Negative Number.");
	}
	}
}
