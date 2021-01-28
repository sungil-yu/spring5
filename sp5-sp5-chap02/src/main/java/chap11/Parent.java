package chap11;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@Id @GeneratedValue
	private Long id;
	
	//orphan은 고아 객체 즉 부모가 연관관계를 취소한 자식 객체를 데이터베이스에서 삭제하는 기능이다.
	@OneToMany(mappedBy = "parent", cascade = {CascadeType.ALL} ,orphanRemoval = true)
	private List<Child> children = new ArrayList<>();
	
}
