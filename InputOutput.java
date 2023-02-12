import java.util.Scanner;
//Import Scanner class
public class InputOutput {
	
	public static void main(String[] args) {
		
	//Create scanner class object
	Scanner in =new Scanner(System.in);
	
	System.out.println("Enter name=");
	String a = in.nextLine();
	
	System.out.println("Enter age=");
	byte b = in.nextByte();
	
	System.out.println("Enter mobile no=");
	short c = in.nextShort();
	
	System.out.println("Enter account no=");
	int d = in.nextInt();
	
	System.out.println("Enter mark%=");
	float e = in.nextFloat();
	
	System.out.println("Enter char=");
	char f = in.next().charAt(0);
	
	System.out.println("Enter boolean=");
	boolean g = in.nextBoolean();
	
	System.out.println("Enter double=");
	double h = in.nextDouble();
	
	System.out.println("-------------------------");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	}
}
