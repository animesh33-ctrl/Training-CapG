package collectionframework;

import java.util.HashMap;

public class HashMapImp {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Animesh", 123);
		map.put("Aditya", 234);
		map.put("Sahil", 420);
		System.out.println(map);
		map.put("Gandu", 230);

		HashMap map2 = new HashMap();
		map2.put("Animesh", "Palui");
		map2.put("Sahil", "Ghosh");
		map2.put("Aditya", 420);
		System.out.println(map2);

	}
}
