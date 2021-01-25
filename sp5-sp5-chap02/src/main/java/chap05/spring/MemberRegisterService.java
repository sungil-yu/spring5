package chap05.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import chap03.exception.DuplicateMemberException;

@Component
public class MemberRegisterService {

	// 직접생성하지 않고 생성자를 통해 의존 객체를 전달 받는다.
	@Autowired
	private MemberDao memberDao;

	// 생성자를 통해 의존하고 있는 객체를 주입 받는 것!
	public MemberRegisterService() {}

	public Long regist(RegisterRequest req) throws DuplicateMemberException {
		Member member = memberDao.selectByEmail(req.getEmail());

		if (member != null) {
			throw new DuplicateMemberException("dup email" + req.getEmail());

		}

		Member newMember = new Member(null, null, null, null, null);
		memberDao.insert(newMember);
		return newMember.getId();
	}

}
