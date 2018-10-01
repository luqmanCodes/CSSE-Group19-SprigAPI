/**
 *  Site Table Model
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
public class Site {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String siteManagerId;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public String getSiteManagerId() {
		return siteManagerId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSiteManagerId(String siteManagerId) {
		this.siteManagerId = siteManagerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
