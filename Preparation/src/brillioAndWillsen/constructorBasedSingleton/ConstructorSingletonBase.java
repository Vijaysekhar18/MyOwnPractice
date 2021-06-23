package brillioAndWillsen.constructorBasedSingleton;

import java.util.HashMap;

public class ConstructorSingletonBase {
	private static HashMap<Class<ConstructorSingletonBase>, ConstructorSingletonBase> refs;
	
	ConstructorSingletonBase() { 
		// Find the caller of this constructor
		Class clz = this.getClass();
		if (clz.equals(ConstructorSingletonBase.class) && refs == null) 
			refs = new HashMap<Class<ConstructorSingletonBase>, ConstructorSingletonBase>();
		
		
		if (refs.containsKey(clz))
			throw new RuntimeException();
		else
			refs.put(clz, this);
	}
	
	public static <T extends ConstructorSingletonBase> T getRef(Class<T> clz) {
		ConstructorSingletonBase obj = refs.get(clz);
		if (obj != null)
			return (T) obj;
		else
			return null;
	}
	
}
