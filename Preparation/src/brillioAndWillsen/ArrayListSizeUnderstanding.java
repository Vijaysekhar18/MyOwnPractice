package brillioAndWillsen;

import java.util.ArrayList;

public class ArrayListSizeUnderstanding {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println("Test");
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Size after adding elements - " + list.size());
		
		list.remove(new Integer(3));
		list.remove(new Integer(4));
		System.out.println("Size after removing elements - " + list.size());
	}

}
