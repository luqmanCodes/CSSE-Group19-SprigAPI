/**
 *  Site Table Model
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
public class Site {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "Site_Manager_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AuthorizedEmployee siteManager;
	
	private String name;
	private String address;
	
	public Site() {
	
	}
	
	public Site(int id, AuthorizedEmployee siteManager, String name, String address) {
		super();
		this.id = id;
		this.siteManager = siteManager;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public AuthorizedEmployee getSiteManager() {
		return siteManager;
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
	public void setSiteManager(AuthorizedEmployee siteManager) {
		this.siteManager = siteManager;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
