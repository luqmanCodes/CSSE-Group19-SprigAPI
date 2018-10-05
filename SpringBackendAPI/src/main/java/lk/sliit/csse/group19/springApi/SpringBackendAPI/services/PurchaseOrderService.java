package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Map;
import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;

/**
 * @author Dev
 *
 */
public interface PurchaseOrderService {

	public Iterable<PurchaseOrder> getAllPurchaseOrders();
	public PurchaseOrder insertPurchaseOrder(Map<String,Object> purchaseOrder);
	public void deletePurchaseOrder(int id);
	public Iterable<PurchaseOrder> getPurchaseOrdersBySiteMangerIdAndStatus(String siteManagerId,String status);
	public Optional<PurchaseOrder> findPurchaseOrder(int id);
	public PurchaseOrder updatePurchaseOrder(int id, PurchaseOrder purchaseOrderDetails);
}
