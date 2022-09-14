package Question5;

import java.util.Collections;
import java.util.Vector;

public class StoredDataInVector {
	
	    public static void main(String args[])
	    {
	        
	        Vector<String> vec = new Vector<String>();
	        vec.add("4");
	        vec.add("2");
	        vec.add("7");
	        vec.add("3");
	        vec.add("2");
	  
	        System.out.println("original vector : " + vec);
	  
	        Collections.sort(vec);
	  
	        System.out.println("\n sorted vector : " + vec);
	    }
	
}
