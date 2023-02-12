
public class LogicalOperator {
	
	public static void main(String[] args) {
		
		System.out.println("Logical AND &&");
		System.out.println((10<20)&&(20<10));// true  false
		System.out.println((10>20)&&(20<10));// false false
		System.out.println((10>20)&&(20>10));// false true
		System.out.println((10<20)&&(20>10));// true false
		
		System.out.println("___________________");
		System.out.println("Logical OR ||");
		System.out.println((10<20)||(20<10));
		System.out.println((10>20)||(20<10));
		System.out.println((10>20)||(20>10));
		System.out.println((10<20)||(20>10));
		
		System.out.println("___________________");
		System.out.println("Logical NOT !");
		System.out.println(!(20<10));
		System.out.println(!(20>10));
	}

}
