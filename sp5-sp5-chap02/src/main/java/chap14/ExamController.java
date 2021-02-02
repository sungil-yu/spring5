package chap14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {

	//지금까지 컨트롤러의 역할을 간단히보면 뷰에 전달할 데이터를 가공 및 전달
	//결과를 보여줄 view 리턴이다. ModelAndView객체를 이용하면 동시에 전달할 수 있다.
	
	@GetMapping("/exam")
	public ModelAndView exam() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("object",Object.class); //데이터
		mav.setViewName("exam/examForm"); //view
		
		return mav;
	}
}
