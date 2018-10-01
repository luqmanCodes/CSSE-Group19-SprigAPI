/**
 * Item Table Model
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
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private String item_Policy;
	private String item_Comment;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getItem_Policy() {
		return item_Policy;
	}
	public String getItem_Comment() {
		return item_Comment;
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
	public void setItem_Policy(String item_Policy) {
		this.item_Policy = item_Policy;
	}
	public void setItem_Comment(String item_Comment) {
		this.item_Comment = item_Comment;
	}
	
}
