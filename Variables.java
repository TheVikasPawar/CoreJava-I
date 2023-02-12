
public class Variables {
	//Variable
	/*
	 * Syntax
	 * 
	 * DataType Variable_name = value;
	 *    int     age         =   21;
	 */
	
	/*
	 * Types of Variable
	 * 1.Local variable
	 * 2.Instance variable
	 * 3.Static variable
	 */
	
	int age = 21;   //Instance Variable
	
	static int mark = 95;	//Static Variable
	
	public static void main(String[]args) {
		int roll=73;	//Local Variable
		
		//Access the Varibles
		
		//Local variable
		System.out.println("Loacal= "+roll);
		
		//Instance variable
		Variables ref = new Variables();
		System.out.println("Instance= "+ref.age);
		
		//Static Variable
		System.out.println("Static= "+Variables.mark);
	}

}
