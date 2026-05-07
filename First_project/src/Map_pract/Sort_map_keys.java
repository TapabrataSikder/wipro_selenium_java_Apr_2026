package Map_pract;
import java.util.*;
public class Sort_map_keys {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
        map.put("Zebra", 10);
        map.put("Apple", 50);
        map.put("Mango", 30);

        TreeMap<String, Integer> ms = new TreeMap<>(map);

        System.out.println("Sorted: " + ms);

	}

}
