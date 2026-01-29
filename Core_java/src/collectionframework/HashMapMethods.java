package collectionframework;

import java.util.HashMap;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Animesh", 123);
		map.put("Aditya", 234);
		map.put("Sahil", 420);
		
		System.out.println(map.get("Animesh")); //123
		System.out.println(map.get("Animeh")); //null
		System.out.println(map.getOrDefault("Sahil", null)); // 420
		System.out.println(map.getOrDefault("Sahi", null)); //null
		System.out.println(map.containsKey("Animesh")); //true
		System.out.println(map.containsValue(123456)); //false
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.replace("Animesh", 123, 234567)); //replace if exists 
		System.out.println(map);
	}
}
