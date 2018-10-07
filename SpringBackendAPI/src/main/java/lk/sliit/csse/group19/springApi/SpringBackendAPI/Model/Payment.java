/**
 * 
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
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "Accountant_ID", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private AuthorizedEmployee authorizedEmployee;
	
	private int invoiceId;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "Supplier_ID", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Supplier supplier;
	
	private int purchaseOrderId;
	
	private String status;
	
	public Payment() {
		
	}
	
	public Payment(int id, AuthorizedEmployee authorizedEmployee, int invoiceId, Supplier supplier, String status) {
		super();
		this.id = id;
		this.authorizedEmployee = authorizedEmployee;
		this.invoiceId = invoiceId;
		this.supplier = supplier;
		this.status = status;
	}
	

	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public int getId() {
		return id;
	}

	public AuthorizedEmployee getAuthorizedEmployee() {
		return authorizedEmployee;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuthorizedEmployee(AuthorizedEmployee authorizedEmployee) {
		this.authorizedEmployee = authorizedEmployee;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
