package chap12;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable  //정의하는 곳에 표시
public class Address {

	
	@Column(name = "city")
	private String city;
	
	private String street;
	
	private String zipcode;
	
	
	//이러한 객체들은 공유 참조를 피하기 위해서 getter만 만들어 놓는 것이 좋다.
	//또한 동등성 비교를 위해 equals를 재정의하는데 이떄 모든 필드값을 비교하도록 구현한다.
}
