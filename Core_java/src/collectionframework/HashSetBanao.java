package collectionframework;

import java.util.HashSet;
public class HashSetBanao {
	
	public String toString() {
		return "";
	}
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);set.add(2);
		set.add(3);
		set.add(1);
		set.add(0);
		set.add(3);
		System.out.println(set.toString());
		
		HashSet set2 = new HashSet();
		set2.add(1);
		set2.add("Animesh");
		set2.add("Sahil BKL");
		set2.add(2.2);
		set2.add(null);
		set2.add(null);
		set2.add("Aditya");
		
		System.out.println(set2);
		
	}
}
