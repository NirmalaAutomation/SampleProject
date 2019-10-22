package Chara;

import java.util.HashMap;

public class CD {

	public static void main(String[] args) {
		/*String s = "welcome to candid java tutorial";
		String s1[]=s.split(" ");
 		System.out.println(s1.length);
 		*/
 	/*	String str = "Java is java again java again";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+str+" = "+count);*/
		
		String str = "All is well";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}