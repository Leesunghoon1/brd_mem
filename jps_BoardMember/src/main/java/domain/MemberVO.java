package domain;

public class MemberVO {
	private String id;
	private String pwd;
	private String email;
	int age;
	private String regdate;
	private String last_login;
	
	public MemberVO() {
	}

	
	
	public MemberVO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	//join, modify

	public MemberVO(String id, String pwd, String email, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
	}

	
	public MemberVO(String id, String pwd, String email, int age, String regdate, String lastlogin) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.regdate = regdate;
		this.last_login = lastlogin;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getLastlogin() {
		return last_login;
	}

	public void setLastlogin(String lastlogin) {
		this.last_login = lastlogin;
	}

	@Override
	public String toString() {
		return "member [id=" + id + ", pwd=" + pwd + ", email=" + email + ", age=" + age + ", regdate=" + regdate
				+ ", lastlogin=" + last_login + "]";
	}
	
	
	
	
}
