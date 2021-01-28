package chap11;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Order {

	@Id
	private String id;
	
	//회원이 order을 프록시 객체로 가지고 있다가 사용할때 order와 product 2개의 엔티티를 가져온다.
	@ManyToOne(fetch = FetchType.EAGER)
	private Product product;
}
