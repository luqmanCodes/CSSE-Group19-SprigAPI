/**
 * Invoice Table Model
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
public class Invoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int purchaseOrderId;
	private int supplierId;
	private double totalPrice;
	private String invoiceComment;
	private Date issueDate;
	
	public int getId() {
		return id;
	}
	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public String getInvoiceComment() {
		return invoiceComment;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setInvoiceComment(String invoiceComment) {
		this.invoiceComment = invoiceComment;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
}
