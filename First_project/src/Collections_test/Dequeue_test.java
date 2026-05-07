package Collections_test;

import java.util.*;

public class Dequeue_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> q=new ArrayDeque<String>();
		
		q.add("Indore");
		q.add("Kolkata");
		q.add("Mumbai");
		q.add("Delhi");
		q.add("Pune");
		q.add("Odisha");
		q.add("Bhopal");
		
		System.out.println("q= "+q);
		System.out.println("getFirst: "+q.getFirst());
		System.out.println("getFirst: "+q.getLast());
		System.out.println("peek: "+q.peek()); //default
		System.out.println("peekFirst: "+q.peekFirst()); // first element
		System.out.println("poll: "+q.poll());
		System.out.println("q= "+q);
		System.out.println("reversed: "+q.reversed());
		System.out.println("pop: "+q.pop());
	}

}
