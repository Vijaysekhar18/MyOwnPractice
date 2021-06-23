package collections;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> c = Class.forName("java.util.List");
			for(Method m: c.getDeclaredMethods()) {
				System.out.print(m.getName() + " - " + "");
				for(Parameter p: m.getParameters()) {
					System.out.print(p.getParameterizedType() + " ");
				}
				System.out.println(" - " + m.getReturnType());
			}
			
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
