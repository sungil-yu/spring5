package chap12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

//값타입을 임베디드 타입으로 정의해보자.
@Entity
public class Member {

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@Embedded //사용하는 곳에 표시
	Period period;
	
	@Embedded
	Address address;
	
	@ElementCollection
	@CollectionTable(name="FAVORITE_FOODS",
	    joinColumns = @JoinColumn(name = "MEMBER_ID"))
	@Column(name = "FOOD_NAME")
	private Set<String> favoriteFoods = new HashSet<>();
	
	@ElementCollection
	@CollectionTable(name="ADDRESS",
	    joinColumns = @JoinColumn(name = "MEMBER_ID"))
	private List<Address> addressHistory = new ArrayList<>();
	
	
}


//이로써 memeber는 응집도 가 높으며 이러한 값타입들은 재사용할 수 있다.