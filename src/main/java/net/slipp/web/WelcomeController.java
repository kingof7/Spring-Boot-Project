package net.slipp.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//mustache(템플릿 엔진) 호출
//데이터를 전달할 클래스, 컨트럴로 역할 의미:어노테이션

@Controller
public class WelcomeController {
	//get방식, 아래 메서드 호출
	@GetMapping("/helloworld") 
	public String welcome(Model model) { //Model은 html로 데이터를 넘겨주는것		
		
		//Arrays.asList쓰면 괄호안에 여러가지 객체를 배열형태로 생성가능
		List<MyModel> repo = Arrays.asList(new MyModel("javajigi"), new MyModel("sanjigi"));
		model.addAttribute("repo", repo);
		
		/*
		 * model.addAttribute("name", "javajigi"); //model에 name이라는 이름으로 저장
		 * model.addAttribute("value", 10000); //age라는 이름으로 브라우저에서 넘어온 age값을
		 * model.addAttribute("taxed_value", 30); model.addAttribute("in_ca", true);
		 */
		return "welcome"; //templates 디렉토리 하위의 welcome.html호
	}
}
