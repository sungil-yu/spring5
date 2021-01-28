package chap10;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Child {

	@Id
	private String id;

	//외래키 매핑시 여러 컬럼은 매핑하므로 joinColumns를 사용
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
			@JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2")
	})
	private Parent parent;
			

	
	
	
}
