/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItemId;

/**
 * @author Dev
 *
 */
public interface PurchaseOrderItemService {

	public Iterable<PurchaseOrderItem> getAllPurchaseOrderItems();
	public Optional<PurchaseOrderItem> findPurchaseOrderItem(PurchaseOrderItemId purchaseOrderItemId);
	public PurchaseOrderItemService insertPurchaseOrderItem(int purchaseOrderId, PurchaseOrderItemService purchaseOrderItemService);
	public PurchaseOrderItemService updatePurchaseOrderItem(int purchaseOrderItemId, PurchaseOrderItemService purchaseOrderItemDetails);
	public boolean deletePurchaseOrderItem(int id);
}
