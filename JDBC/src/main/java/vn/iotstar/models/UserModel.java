package vn.iotstar.models;

import java.io.Serializable;

public class UserModel implements Serializable{
	
	private static final long serialVersionUID = 5679941521999426188L;
	
	private int id;
	private String username;
	private String password;
	private String image;
	private String fullname;
	
	public UserModel(int id, String username, String password, String image, String fullname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.image = image;
		this.fullname = fullname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", password=" + password + ", image=" + image
				+ ", fullname=" + fullname + "]";
	}
	
	
}
