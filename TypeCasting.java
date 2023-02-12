
public class TypeCasting {
	/*	Type Casting	*/
	
	/*
	 * Two types of type casting
	 * 1.Implicit
	 * byte>short>char>int>long>float>double
	 * 
	 * 2.Explicit
	 * double>float>long>int>char>short>byte
	 */
	
	public static void main(String[] args) {
		
		//implicit
		int a = 10;
		//Convert into float
		float b = a;
		System.out.println(b);
		
		//Explicit
		double c = 10.4756437586957632;
		//Convert into float and int
		
		float d = (float) c;
		int e = (int) c;
		
		System.out.println(d);
		System.out.println(e);
		
		
	}

}
