package chap09.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "ORDERS")
public class Order {
	
	@Id @GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	
	//상품과는 N:1관계 양방향
	@ManyToOne
	@JoinColumn(name = "MEMBER_ID")
	private Member member;
	
	//주문과 1:1 양방향
	@OneToOne
	@JoinColumn(name = "DELIVERY_ID")
	private Delivery delivery;
	
	//주문 상품과는 1:N
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems =
			new ArrayList<>();

	
	public void setMember(Member member) {
		if(this.member != null) {
			this.member.getOrders().remove(this);
		}
		//기존관계를 제거하고 재설정해준다.
		this.member = member;
		member.getOrders().add(this);
		
	}
	
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
		delivery.setOrder(this);
		
		
	}
}
