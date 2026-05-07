package Map_pract;

import java.util.LinkedHashMap;
import java.util.*;

public class Tree_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new TreeMap<String, Integer>();
		
		//     Key   Value
		map.put("One", 10);
		map.put("Two", 20);
		map.put("Three", 30);
		map.put("Four", 40);
		map.put("Five", 50);
		map.put("Six", 20);


		
		System.out.println(map);
		System.out.println(map.containsKey("Five"));
		System.out.println(map.containsValue(50));
		
		map.replace("Six", 6);
		System.out.println(map);
		
		System.out.println(map.get("Two"));

	}

}
