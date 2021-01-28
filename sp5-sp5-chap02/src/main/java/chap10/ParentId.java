package chap10;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * 식별자 클래스 속성명과 엔티티에서 사용하는 식별자의 속성명이 같아야 한다.
 * Serializable 인터페이스를 구현해야한다.
 * equals, hashCode가 있어야한다.
 * 기본 생성자가 있어야 한다.
 * 식별자 클래스의 접근 권한은 public이여야 한다. 
 * */

@Embeddable
public class ParentId implements Serializable{

	//ID와는 다르게 Embed는 식별자 클래스에 기본키를 직접 매핑한다.
	
	@Column(name = "PARENT_ID1")
	private String id1;
	@Column(name = "PARENT_ID2")
	private String id2;
	
	
	
	public ParentId() {
	}



	public ParentId(String id1, String id2) {
		this.id1 = id1;
		this.id2 = id2;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}
