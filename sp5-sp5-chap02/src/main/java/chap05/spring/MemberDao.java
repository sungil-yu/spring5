package chap05.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {

	private static long nextId =0;
	
	private Map<String,Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
			
		return map.get(email);
	}

	public void insert(Member newMember) {
		// TODO Auto-generated method stub
		
	}

	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

}
