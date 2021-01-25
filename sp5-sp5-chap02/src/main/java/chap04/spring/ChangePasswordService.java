package chap04.spring;

import org.springframework.beans.factory.annotation.Autowired;

import chap04.exception.MemberNotFoundException;

public class ChangePasswordService {

	@Autowired
	private MemberDao memberDao;

	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) 
			throw new MemberNotFoundException("not Found");
		
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}
	
//	public void setMmeberDao(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
}
