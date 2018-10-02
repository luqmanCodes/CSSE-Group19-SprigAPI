package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Dev
 * Authorized Employee Table Model
 */
@Entity
public class AuthorizedEmployee {
	
	@Id
	private String id;
	private String name;
	private String password;
	
	private String mobile_Number;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getMobileNumber() {
		return mobile_Number;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMobileNumber(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}
	
	
}
