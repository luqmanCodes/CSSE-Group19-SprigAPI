/**
 * Item Table Model
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dev
 *
 */
@Entity
@Table(name = "Item")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Price")
	private double price;
	
	@Column(name="Item_policy")
	private String itemPolicy;
	
	@Column(name="Item_Comment")
	private String itemComment;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getItemPolicy() {
		return itemPolicy;
	}

	public String getItemComment() {
		return itemComment;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setItemPolicy(String itemPolicy) {
		this.itemPolicy = itemPolicy;
	}

	public void setItemComment(String itemComment) {
		this.itemComment = itemComment;
	}
	
}
