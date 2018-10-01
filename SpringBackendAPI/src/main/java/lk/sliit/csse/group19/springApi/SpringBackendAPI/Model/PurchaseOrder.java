/**
 * PurchaseOrder Table Model
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Dev
 *
 */
@Entity
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String siteManagerId;
	private String managerId;
	private int supplierId;
	private String status;
	private String orderComment;
	private Date initiatedDate;
	private Date expectedDate;
	
	public int getId() {
		return id;
	}
	public String getSiteManagerId() {
		return siteManagerId;
	}
	public String getManagerId() {
		return managerId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public String getStatus() {
		return status;
	}
	public String getOrderComment() {
		return orderComment;
	}
	public Date getInitiatedDate() {
		return initiatedDate;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSiteManagerId(String siteManagerId) {
		this.siteManagerId = siteManagerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}
	public void setInitiatedDate(Date initiatedDate) {
		this.initiatedDate = initiatedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	
}
