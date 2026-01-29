package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArray {
	public static void main(String[] args) {
		String arr[]= {"a","b","c","a"};
		
		List<String> list = Arrays.asList(arr);
		Set<String> set = new HashSet<>(list);
		
		System.out.println("List : "+list);
		System.out.println("Set : "+set);
	}
}
