/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Dev
 *
 */
@Entity
public class PurchaseOrderItem {

	@EmbeddedId
	private PurchaseOrderItemId purchaseOrderItemId;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public PurchaseOrderItemId getPurchaseOrderItemId() {
		return purchaseOrderItemId;
	}
	public void setPurchaseOrderItemId(PurchaseOrderItemId purchaseOrderItemId) {
		this.purchaseOrderItemId = purchaseOrderItemId;
	}
}
