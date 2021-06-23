package jackson;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonRootName(value="ExtendableBeanRoot", namespace="Jackson")
@JsonPropertyOrder({"id", "properties", "name"})
public class ExtendableBean {
	@JsonProperty(required=true)
	public String name;
	public int id;
	@JsonRawValue
	private Map<String, String> properties;
	@JsonSerialize(using = CustomObjectSerializer.class)
	private AssociatedBean associate;
	
	{
		final List<String> WORDS = new ArrayList<String>();
		WORDS.add("Hello");
		WORDS.add("World");
		
		final List<Integer> NUMS = new ArrayList<Integer>();
		NUMS.add(2); NUMS.add(0); NUMS.add(2); NUMS.add(0);
		
		this.associate = new AssociatedBean(WORDS, NUMS);
		this.properties = new Hashtable<String, String>();
	}
	
	//Constructor with parameter Name
	public ExtendableBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//Adding a property
	public void add(String key, String value) {
		properties.put(key, value);
	}
	
	//Getters and Setters
	@JsonGetter("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AssociatedBean getAssociate() {
		return associate;
	}

	public void setAssociate(AssociatedBean associate) {
		this.associate = associate;
	}	
}
