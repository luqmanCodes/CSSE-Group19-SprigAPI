/**
 * PurchaseOrder Table Model
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import io.micrometer.core.lang.Nullable;

/**
 * @author Dev
 *
 */
@Entity
@Table(name = "Purchase_Order")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Site_Manager_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private String siteManagerId;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "Manager_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@Nullable
	private AuthorizedEmployee manager;
	
	@Column(nullable = true)
	private Integer supplierId;
	
	@NotNull
	@Column(name="Status")
	private String status;
	
	@Column(name = "Order_Comment", nullable = true)
	private String orderComment;
	private Date initiatedDate;
	private Date expectedDate;
	
	
	public int getId() {
		return id;
	}

	public AuthorizedEmployee getManager() {
		return manager;
	}

	public Integer getSupplierId() {
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

	public void setManager(AuthorizedEmployee manager) {
		this.manager = manager;
	}

	public void setSupplierId(Integer supplierId) {
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
	
	public String getSiteManagerId() {
		return siteManagerId;
	}

	public void setSiteManagerId(String siteManagerId) {
		this.siteManagerId = siteManagerId;
	}
}
