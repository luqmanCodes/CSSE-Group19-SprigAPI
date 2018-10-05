/**
 *  Policy Table Model
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * @author Dev
 *
 */
@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "Manager_ID", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AuthorizedEmployee authorizedEmployee;
	
	private String type;
	private double value;
	
	public Policy() {
		
	}
	
	public Policy(int id, AuthorizedEmployee authorizedEmployee, String type, double value) {
		super();
		this.id = id;
		this.authorizedEmployee = authorizedEmployee;
		this.type = type;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	public AuthorizedEmployee getAuthorizedEmployee() {
		return authorizedEmployee;
	}
	public String getType() {
		return type;
	}
	public double getValue() {
		return value;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAuthorizedEmployee(AuthorizedEmployee authorizedEmployee) {
		this.authorizedEmployee = authorizedEmployee;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
}
