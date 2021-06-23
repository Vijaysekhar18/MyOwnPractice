package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Testing {
	public static void main(String[] args) throws JsonProcessingException {
		ExtendableBean bean = new ExtendableBean(1, "Bean1");
		bean.add("key1", "value1");
		bean.add("key2", "value2");
		
		System.out.println(new ObjectMapper().writeValueAsString(bean));
	}
}