package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//mustache(템플릿 엔진) 호출
//데이터를 전달할 클래스, 컨트럴로 역할 의미:어노테이션

@Controller
public class WelcomeController {
	//get방식, 아래 메서드 호출
	@GetMapping("/helloworld") 
	public String welcome(String name, int age, Model model) { //Model은 html로 데이터를 넘겨주는것
		System.out.println("name: " + name + " age: " + age); //console에 찍힘
		model.addAttribute("name", name); //model에 name이라는 이름으로 저장
		model.addAttribute("age", age); //age라는 이름으로 브라우저에서 넘어온 age값을
		return "welcome"; //templates 디렉토리 하위의 welcome.html호
	}
}
