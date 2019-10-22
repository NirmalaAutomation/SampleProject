package Hash;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Dul {

	public static void main(String[] args) {
		String s="SSETT";
		char[] c=s.toCharArray();
		LinkedHashMap<Character,Integer> lh=new LinkedHashMap<Character,Integer>();
		Set<Map.Entry<Character,Integer>> entrySet=lh.entrySet();
		for(Map.Entry<Character,Integer> v:entrySet) {
			if(v.getValue()>1)
			System.out.println(v.getKey());
		}
		

	}

}
