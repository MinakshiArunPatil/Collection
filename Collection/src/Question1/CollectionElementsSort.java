package Question1;
import java.util.*;

public class CollectionElementsSort {
	public static void main(String[] args)
    {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(7);
        al.add(4);
        al.add(9);
        al.add(5);
 
        Collections.sort(al);
      
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);
    }

}
