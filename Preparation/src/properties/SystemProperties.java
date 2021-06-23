package properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		Set<Map.Entry<Object, Object>> props = p.entrySet();
		for(Map.Entry<Object, Object> temp: props) {
			System.out.println( temp.getKey() + " - " + temp.getValue());
		}
	}

}
