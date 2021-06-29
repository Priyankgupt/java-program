/* Gaurangi Tripathi B. Tech CSE

 The least recently used (LRU) cache algorithm exists the element from the cache(when it’s full) that was least recently used. After an element is requested from the cache,
it should be added to the cache (if not already there) and considered the most recently used
element in the cache.

Initially, the cache is empty. The program must return an integer for the number of cache misses using the LRU cache
algorithm.
Assume that the array pages always have pages numbered from 1 to 50.
*/
package prg;
import java.util.ArrayList;
import java.util.Scanner;
public class lru
{
		public static void main(String[] args)
		{
	    	Scanner sc =new Scanner(System.in);
			System.out.println("Enter Cache Size: ");
			int capacity = sc.nextInt(); 
			System.out.println("Enter Array Size: ");
			int arraysize=sc.nextInt();      
			int[] arr = new int[arraysize];
			System.out.println("Enter Array Elements: ");
			for(int i = 0; i < arraysize; i++)     
				arr[i] = sc.nextInt();
	          
        // To represent set of current pages.We use an Arraylist
        ArrayList<Integer> s = new ArrayList<>(capacity);
        int count = 0;
        int page_faults = 0;
        for(int i:arr)
        {
        		// insert if not present
            	if(!s.contains(i))
            	{
              
            		// Check if the set can hold equal pages
            		if(s.size()==capacity)
            		{
            			s.remove(0);
            			s.add(capacity-1,i);
            		}
            		else
            			s.add(count,i);
            			// Increment page faults
            		page_faults++;
            		++count;
            	}
            	else
            	{
            		// Remove the indexes page
            		s.remove((Object)i);
            		// insert the current page
            		s.add(s.size(),i);         
            	}
          
        }
        System.out.println(page_faults);
        sc.close();
    }
}
