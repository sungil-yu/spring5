package chap03.DI1;

import java.time.LocalDateTime;
import chap03.exception.WrongPasswordException;

public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member(Long id, String email, String password, 
			String name, LocalDateTime registerDateTime) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	
	
	//자신의 멤버를 가지고 역할을 할 수 있으니 여기다 변경메소드를 만든다.
	public void changePassword(String oldPassword, String newPassword) throws WrongPasswordException {
		if(!password.equals(oldPassword))
			throw new WrongPasswordException();
		this.password = newPassword;
		
		
	}
}
