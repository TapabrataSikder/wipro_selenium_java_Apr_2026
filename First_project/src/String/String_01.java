package String;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		String s2 = "World";
		
//		s1 = s1.concat(s2);
		
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.indexOf('l'));
		
		System.out.println(s1.codePointAt(2));  // ASCII values of character
		System.out.println(s2.codePointBefore(3));  // ASCII values of character
	
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.contains("ll"));
		
		System.out.println(s1.equals("Hello"));
		
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.lastIndexOf("el"));
	}

}
