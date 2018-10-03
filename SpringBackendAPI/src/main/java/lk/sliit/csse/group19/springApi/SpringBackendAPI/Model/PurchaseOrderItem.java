/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

/**
 * @author Dev
 *
 */
public class PurchaseOrderItem {

	private int purchaseOrderId;
	private int itemId;
	
	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
