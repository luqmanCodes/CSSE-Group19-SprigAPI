package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;

/**
 * @author Dev
 *
 */
public interface PurchaseOrderService {

	public Iterable<PurchaseOrder> getAllPurchaseOrders();
	public PurchaseOrder insertPurchaseOrder(PurchaseOrder purchaseOrder);
	public void deletePurchaseOrder(int id);
}
