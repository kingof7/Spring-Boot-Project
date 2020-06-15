package net.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.slipp.domain.User;
import net.slipp.domain.UserRepository;

//Controller는 클라이언트에서 요청한 url을 이름을 찾아서, 데이터를 넘겨줄 view와 매핑해줌
@Controller
public class UserController {
	//private List<User> users = new ArrayList<User>();
	
	//UserRepository.java에서 데이터를 여기로 보내고
	@Autowired // 인터페이스 가져다씀
	private UserRepository userRepository;
	
	@PostMapping("/create")	//form.html에서 action="/create"로 넘겨준 것을 받음음
	public String create(User user) { // String userId, int password,..쓰기귀찮으니까 User클래스로 객체를 생성해서 넣어줌
		System.out.println("user : " + user);
		//users.add(user); // 저장		
		userRepository.save(user); //db에 저장		
		return "redirect:/list"; //회원가입후 template 폴더의 list.html로이동
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", userRepository.findAll()); //사용자목록 저장, H2 DB에있는 데이터를 모두 담아서 리스트에 넣어줌 -> 맨위에 리스트컬렉션 필요없음
		return "list";	
	}
	
	
}
