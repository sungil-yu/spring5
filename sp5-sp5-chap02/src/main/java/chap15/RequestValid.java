package chap15;

import org.hibernate.validator.constraints.NotBlank;

public class RequestValid {
	
	@NotBlank
	private String name;
}
