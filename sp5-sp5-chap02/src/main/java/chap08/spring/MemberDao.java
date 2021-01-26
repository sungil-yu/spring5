package chap08.spring;

import javax.persistence.*;


@Entity
@Table(name="MEMBER")
public class MemberDao {
	
	
	@Id
	@Column(name ="ID")
	private String id;
	
	@Column(name = "NAME")
	private String username;
	
	private String age;
	
	
	
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

	public Member selectByEmail(String email) {
			
		return null;

	public void insert(Member newMember) {
		// TODO Auto-generated method stub
		
	}

	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

}
