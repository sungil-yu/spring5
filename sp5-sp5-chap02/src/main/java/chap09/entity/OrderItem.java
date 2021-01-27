package chap09.entity;

import javax.persistence.*;

import chap08.spring.Item;
import chap08.spring.Order;

@Entity
public class OrderItem {

	//식별키를 대리키로 사용
	@Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;      
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;   

	
}
