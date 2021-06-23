package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3}));
		/*for(Integer tmp: l) {
			if (tmp == 2) {
				l.remove(tmp);
				System.out.println("Removed");
			}
			else System.out.println("Num: " + val);
		}*/
		System.out.print("Before: [");
		for(int i: l) System.out.print(i + ", ");
		System.out.println("]");
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			Integer val = itr.next();
			if (val == 2) itr.remove();
			//System.out.println(val);
			
		}
		
		
		System.out.print("After: [");
		for(int i: l) System.out.print(i + ", ");
		System.out.println("]");
	}
}