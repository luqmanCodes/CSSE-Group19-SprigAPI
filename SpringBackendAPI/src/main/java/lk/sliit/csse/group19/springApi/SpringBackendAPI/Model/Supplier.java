/**
 * Supplier Table Model
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
public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String phone_Number;
	private String email;
	private String bank_Account_Number;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phone_Number;
	}
	public String getEmail() {
		return email;
	}
	public String getBankAccountNumber() {
		return bank_Account_Number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBankAccountNumber(String bank_Account_Number) {
		this.bank_Account_Number = bank_Account_Number;
	}	
	
	
}
