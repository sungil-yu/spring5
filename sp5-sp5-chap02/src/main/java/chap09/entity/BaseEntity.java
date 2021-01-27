package chap09.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id @GeneratedValue
	private Long id;
	private String name;
}


/*
 * 이 추상 클래스는 객체들이 주로 사용하는 공통 매핑 정보를 정의했다.
 * 여기서의 @MappedSuperclass는 테이블과 매핑할 필요가 없고 공통으로 사용되는 매핑 정보만 제공하면된다.
 */