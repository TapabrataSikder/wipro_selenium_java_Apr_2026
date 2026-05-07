package Collections_test;
import java.util.*;
public class Priority_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<String>();
		
		q.add("Indore");
		q.add("Kolkata");
		q.add("Mumbai");
		q.add("Delhi");
		q.add("Pune");
		q.add("Odisha");
		q.add("Bhopal");
		
		q.offer("Alpha");
		
		System.out.println(q);
		q.remove();
		
		String st="Pune";
		System.out.println(q);
		System.out.println("Hashcode of "+st+": "+st.hashCode());
		
		String st1=q.peek();
		System.out.println("Hashcode of "+st1+": "+st1.hashCode());
	}

}
