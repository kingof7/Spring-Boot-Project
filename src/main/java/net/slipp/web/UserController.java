package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

//Controller는 클라이언트에서 요청한 url을 이름을 찾아서, 데이터를 넘겨줄 view와 매핑해줌
@Controller
public class UserController {
	@PostMapping("/create")
	
	public String create(User user) { // String userId, int password,..쓰기귀찮으니까 User클래스로 객체를 생성해서 넣어줌
		System.out.println("user : " + user);
		return "index"; //index.html로 보냄
	}
}
