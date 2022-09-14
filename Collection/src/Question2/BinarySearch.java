package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	 public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<Integer>();
	        al.add(1);
	        al.add(7);
	        al.add(4);
	        al.add(9);
	        al.add(5);
	        
	        
	        int index = Collections.binarySearch(al, 9);
	        System.out.println(index);
	  
	        
	        index = Collections.binarySearch(al, 10);
	        System.out.println(index);
	    }

}
