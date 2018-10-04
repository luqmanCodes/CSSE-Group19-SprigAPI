package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PurchaseOrderItemId implements Serializable {

	private int purchaseOrderId;
	private int itemId;
	
	public PurchaseOrderItemId() {}
	public PurchaseOrderItemId(int purchaseOrderId, int itemId) {
		super();
		this.purchaseOrderId = purchaseOrderId;
		this.itemId = itemId;
	}
	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}
	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
}
