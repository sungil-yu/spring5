package chap09.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID")),
	@AttributeOverride(name = "name", column = @Column(name = "MEMBER_NAME")),
	//상속받은 속성을 재정의할 수 도 있다.
})
public class Member extends BaseEntity{

	//id와 name은 상속을 받는다.
	
	
	private String email;
	
	
	
}
