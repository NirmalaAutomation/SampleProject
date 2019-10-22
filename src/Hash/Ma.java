package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ma {

	public static void main(String[] args) {
		//Write a Java Program to count the number of words in a string using HashMap
		/*String str = "This this is is done by Saket Saket";
		
		        String split[]=str.split("");
		        HashMap<String,Integer> hm=new HashMap<String,Integer>();
		        for(int i=0;i<=split.length-1;i++) {
		        	if(hm.containsKey(split[i])) {
		        		int count=hm.get(split[i]);
		        		hm.put(split[i], count+1);
		        	}
		        	else {
		        		hm.put(split[i], 1);
		        	}
		        	System.out.println(hm);
		        }*/
	//Write a Java Program to iterate HashMap using While and advance for loop	
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Siva", 1);
		hm.put("Siv", 2);
		hm.put("Si", 3);
		
		System.out.println("While loop");
		
		Set entrySet=hm.entrySet();
		Iterator it=entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry m=(Map.Entry)it.next();
			System.out.println(m.getKey()+""+m.getValue());
		}
		System.out.println("For loop");
		
		for(Map.Entry m1:hm.entrySet()) {
			System.out.println(m1.getKey()+""+m1.getValue());
		}
		    }
	
		 
	
		}
