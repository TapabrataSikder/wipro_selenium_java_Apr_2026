package String;

public class Mutable_string_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immutable string
		String str = "Java Selenium";
		System.out.println("Original str= "+str);
		
		//Convert IMmutable to mutable
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Mutable String= "+sb);
		
		//Convert mutable String to immutable
		String str1 = new String(sb);
		System.out.println("str1= "+str); // Java Selenium
		
		
		sb.append(" SDET");
		System.out.println("Append sb= "+sb);  // Java Selenium SDET
		
		System.out.println("Length of sb= "+sb.length()); // 18
		System.out.println("Capacity of sb= "+sb.capacity()); //29
		

	}

}
