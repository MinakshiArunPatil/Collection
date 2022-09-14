package Question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapElements {
	
	static Map<String, Integer> map = new HashMap<>();
	     
	public static void sortbykey()
	        {
	            ArrayList<String> sortedKeys
	                = new ArrayList<String>(map.keySet());
	     
	            Collections.sort(sortedKeys);
	     
	           
	            for (String x : sortedKeys)
	                System.out.println("Key = " + x);
	                                   
	        }
	        public static void main(String args[])
	        {
	          
	            map.put("Pune", 80);
	            map.put("Mumbai", 90);
	            map.put("Nagar", 80);
	            map.put("Nashik", 75);
	            map.put("Nagpur", 40);
	            
	            System.out.println(map);
	               sortbykey();
	        }
	

}
