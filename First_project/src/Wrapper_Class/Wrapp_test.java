package Wrapper_Class;
// primitive to wrapper class
// byte 	->	 Byte
//short	->		 Short
//int	->		 Integer
//char	->		 Character
//boolean	->	 Boolean
//float	->		 Float
//double	->	 Double
public class Wrapp_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; // 4 byte
		Integer b=a; // Auto-boxing primitive to object
		
		int c=b; // Un-Boxing
		
		System.out.println("a: "+a);
		System.out.println("Type of b: "+b.getClass()+" | b: "+b);
		System.out.println("c: "+c);
		
		System.out.println("-".repeat(40));
		
		float i=20;
		Float j=i;
		float k=j;
		System.out.println("i: "+i);
		System.out.println("Type of j: "+j.getClass()+" | j: "+j);
		System.out.println("k: "+k);
		
		

	}

}
