package chap03.assembler;

import chap03.DI2.MemberDao;
import chap03.DI2.MemberRegisterService;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	
	
	public Assembler(MemberDao memberDao, MemberRegisterService regSvc) {
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao);
	
	}
	//이 클래스에서 DI된 regSvc를 가져올 수 있어야하고 생성된 MemberDAO도 접근 할수 있게 getter가 필요하겠네


	public MemberDao getMemberDao() {
		return memberDao;
	}


	public MemberRegisterService getRegSvc() {
		return regSvc;
	}
	
	
	
	
	
	
}
