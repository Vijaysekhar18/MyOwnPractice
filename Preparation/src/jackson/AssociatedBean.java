package jackson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;

public class AssociatedBean {
	private List<String> words;
	private List<Integer> numbers;
	public AssociatedBean(List<String> words, List<Integer> numbers) {
		super();
		this.words = words;
		this.numbers = numbers;
	}

	@JsonRawValue
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
	public List<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}	
}
