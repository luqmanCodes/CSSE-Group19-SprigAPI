/**
 * @author Dev
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthorizedEmployee {
	
	@Id
	private String id;
	private String name;
	private String password;
	
	private String mobileNumber;
	
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
		return mobileNumber;
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
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
