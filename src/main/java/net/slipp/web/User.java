package net.slipp.web;

public class User {
	//form.html에서 온 값들을 모두 String, int로 받고
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
	public String toString() { // toString 없으면, 브라우저 리프레시 했을 때 콘솔창에 주소만 뜸ㄴ
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
