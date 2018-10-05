/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItemId;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PurchaseOrderItemRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PurchaseOrderRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PurchaseOrderItemService;

/**
 * @author Dev
 *
 */
public class PurchaseOrderItemServiceImplementaion implements PurchaseOrderItemService{

	@Autowired
	private PurchaseOrderItemRepository purchaseOrderItemRepository;
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	@Override
	public Iterable<PurchaseOrderItem> getAllPurchaseOrderItems() {
		return this.purchaseOrderItemRepository.findAll();
	}

	@Override
	public Optional<PurchaseOrderItem> findPurchaseOrderItem(PurchaseOrderItemId purchaseOrderItemId) {
		return this.purchaseOrderItemRepository.findById(purchaseOrderItemId);
	}

	@Override
	public PurchaseOrderItemService insertPurchaseOrderItem(int purchaseOrderId,
			PurchaseOrderItemService purchaseOrderItemService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrderItemService updatePurchaseOrderItem(int purchaseOrderItemId,
			PurchaseOrderItemService purchaseOrderItemDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePurchaseOrderItem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
