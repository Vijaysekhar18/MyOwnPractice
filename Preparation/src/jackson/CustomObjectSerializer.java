package jackson;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomObjectSerializer extends JsonSerializer<AssociatedBean>{
	@Override
	public void serialize(AssociatedBean associate, JsonGenerator gen, SerializerProvider arg2) throws IOException {
		// TODO Auto-generated method stub
		String output = "Words: " + Arrays.toString(associate.getWords().toArray());
		output += " Nums: " + Arrays.toString(associate.getNumbers().toArray());
		gen.writeString(output);
	}
}
