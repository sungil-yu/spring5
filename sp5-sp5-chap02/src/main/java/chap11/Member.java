package chap11;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Member {

	@Id
	private String id;
	
	private String username;
	private String age;
	
	//Member는 Team와 자주 사용된다고 가정 -> 즉시 로딩
	@ManyToOne(fetch = FetchType.EAGER)
	private Team team;
	
	//Order는 드물게 사용된다고 가정 -> 지연 로딩
	@OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
	private List<Order> orders;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
