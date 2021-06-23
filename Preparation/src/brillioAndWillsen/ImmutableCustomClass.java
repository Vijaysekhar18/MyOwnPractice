package brillioAndWillsen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Declare the class as final so it can’t be extended.
 * Make all fields private so that direct access is not allowed.
 * Don’t provide setter methods for variables.
 * Make all mutable fields final so that its value can be assigned only once.
 * Initialize all the fields via a constructor performing deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 * 
 * Immutable classes are implicitly thread safe
 * Good for caching purpose
 * Good for using it as Keys in Maps as they don't get updated after map has hashed
 * 
 * @author https://www.journaldev.com/129/how-to-create-immutable-class-in-java
 */
final public class ImmutableCustomClass {
	private final int id;
	private final String name;
	private final List<Integer> list;
	
	public ImmutableCustomClass(int id, String name, List<Integer> list) {
		this.id = id;
		this.name = name;
		this.list = new ArrayList<Integer>(list);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getList() {
		return new ArrayList<Integer>(this.list);
	}
	
	@Override
	public String toString() {
		//String str = "ImmutableCustomClass (" + id + ", " + name + "): " + 
		return "ImmutableCustomClass [id=" + id + ", name=" + name + ", list=" + Arrays.toString( list.toArray() ) + "]";
	}

	public static void main(String[] args) {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(2);
		inputList.add(2);
		inputList.add(2);
		inputList.add(2);
		
		ImmutableCustomClass testClass = new ImmutableCustomClass(0, "sai", inputList);
		System.out.println("Initial Object " + testClass);
		inputList.add(4);
		inputList.add(5);
		System.out.println("Updated mutable field " + testClass);
		testClass.getList().add(5);
		System.out.println("Updated Get List " + testClass);
	}
}
