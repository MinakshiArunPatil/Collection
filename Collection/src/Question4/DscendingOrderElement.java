package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DscendingOrderElement {
	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(20);
	        list.add(10);
	        list.add(5);
	        list.add(8);
	        list.add(5);
	        System.out.println("ArrayList"+list);
	        
	        //Construct a new list from the set constucted from elements
	        // of the original list
	        List<Integer> newList = list.stream()
	                                      .distinct()
	                                      .collect(Collectors.toList());
	  
	        // Print the ArrayList with duplicates removed
	        System.out.println("ArrayList with duplicates removed: "
	                           + newList);
	        Collections.sort(newList);
	        Collections.reverse(newList);
	        System.out.println("dscending order : " + newList);
	    
	        
	    }

}
