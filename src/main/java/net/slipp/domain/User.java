package net.slipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //db와 연동되는것을 인식시켜주는 annotation
public class User {
	//form.html에서 온 값들을 모두 String, int로 받고
	@Id //primary key : id가 된다
	@GeneratedValue // id 순번을 자동으로 1씩 증가시켜주는 어노테이션
	private Long id;
	
	@Column(nullable=false, length=20)
	private String userId;
	
	private String password;
	private String name;
	private String email;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//뿌려줌
	@Override
	public String toString() { // toString 없으면, 브라우저 리프레시 했을 때 콘솔창에 주소만 뜸
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
