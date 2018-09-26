package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthorizedEmployee {
	
	@Id
	private String empId;
	private String name;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
