package chap03.DI1;

import chap03.exception.DuplicateMemberException;

public class MemberRegisterService {
	//이 클래스는 MemberDao에 의존한다 = 변경에 영향을 받는다.
	private MemberDao memberDao = new MemberDao();
	
	public void regist(RegisterRequest req) throws DuplicateMemberException {
		Member member = memberDao.selectByEmail(req.getEmail());
		
		if(member != null) {
			throw new DuplicateMemberException("dup email" + req.getEmail());
			
		}
		
		Member newMember  = new Member(null, null, null, null, null);
		memberDao.insert(newMember);
	}
	
}

//직접 생성하는 것은 쉽지만 유지보수관점에서 좋지않다.
//스프링 DI를 이용하면 의존객체를 직접생성하는 것이 아닌 전달받는 방식을 사용한다.