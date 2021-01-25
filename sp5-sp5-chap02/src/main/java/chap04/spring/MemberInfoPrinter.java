package chap04.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if( member == null ) {
			System.out.println("No Data");
			return;
		}
		
		printer.print(member);
		System.out.println();
	}
	
	
	//method에도 @autoweired가 가능하다.
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}


