package brillioAndWillsen.constructorBasedSingleton;

public class Main {

	public static void main(String[] args) {
		try {
			ConstructorSingletonBase base = new ConstructorSingletonBase();
			ConstructorSingletonChild child = new ConstructorSingletonChild();
			System.out.println(ConstructorSingletonChild.getRef(ConstructorSingletonChild.class) == child);
			ConstructorSingletonChild child2 = new ConstructorSingletonChild();
			
		}
		catch (RuntimeException ex) {
			System.out.println("Second Object creation Failed");
			ex.printStackTrace();
		}
	}

}
