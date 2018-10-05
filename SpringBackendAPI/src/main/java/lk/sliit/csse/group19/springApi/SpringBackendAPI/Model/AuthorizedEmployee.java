package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Dev
 * Authorized Employee Table Model
 */
@Entity
public class AuthorizedEmployee {
	
	@Id
	@Size(max = 10)
	@Column(name = "ID")
	private String id;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "Type")
	public String type;
	
	@NotNull
	@Size(max = 30)
	@Column(name = "Name")
	private String name;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "Password")
	private String password;
	
	@NotNull
	@Size(max = 10)
	@Column(name = "Mobile_Number")
	private String mobileNumber;

	public AuthorizedEmployee() {
		
	}

	public AuthorizedEmployee(String id, @NotNull @Size(max = 20) String type, @NotNull @Size(max = 30) String name,
			@NotNull @Size(max = 255) String password, @NotNull @Size(max = 10) String mobileNumber) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
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

	public void setType(String type) {
		this.type = type;
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
