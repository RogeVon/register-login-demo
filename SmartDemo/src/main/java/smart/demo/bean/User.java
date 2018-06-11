package smart.demo.bean;

public class User {
	
	private  Integer id;
	private  String  userName;
	private  String  passWord;
	private  String  phone;
	
	
	
	public User() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		
		this.id= id;
	}

	



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (passWord == null) {
			if (other.passWord != null)
				return false;
		} else if (!passWord.equals(other.passWord))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", phone=" + phone + "]";
	}
	
	
}
