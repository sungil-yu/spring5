package chap04.spring;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberPrinter {

	private DateTimeFormatter dateTimeFormatter;

	public void print(Member member) {

		if (dateTimeFormatter == null) {
			System.out.printf("회원 정보 :  아이디=%d, 이메일 =%s, 이름=%s, 등록일=%tF\n", member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf("회원 정보 :  아이디=%d, 이메일 =%s, 이름=%s, 등록일=%s\n", member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		}

	}
	//자동 주입할 대상이 필 수 가 아닌경우에는 required 속성을 false로 지정한다.
	@Autowired
	public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
		
			this.dateTimeFormatter = formatterOpt.orElse(null);
		
	}
}
