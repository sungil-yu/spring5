package chap09.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {

	@Id @GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;
	
	//회원과 상품의 관계는 1:N이다.
	@OneToMany(mappedBy = "member")
	private List<Order> orders= new ArrayList<>();

	public List<Order> getOrders() {
		
		
		return orders;
	}
	
	
	
	
	
}
