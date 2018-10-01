/**
 *  Policy Table Model
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Dev
 *
 */
@Entity
public class Policy {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ManagerId;
	private String type;
	private double value;
	
	public int getId() {
		return id;
	}
	public String getManagerId() {
		return ManagerId;
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
	public void setManagerId(String managerId) {
		ManagerId = managerId;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
