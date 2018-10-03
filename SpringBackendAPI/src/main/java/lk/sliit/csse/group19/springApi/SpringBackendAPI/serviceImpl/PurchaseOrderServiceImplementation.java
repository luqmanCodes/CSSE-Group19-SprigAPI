package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PurchaseOrderRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PurchaseOrderService;

@Service
public class PurchaseOrderServiceImplementation implements PurchaseOrderService {

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	@Override
	public Iterable<PurchaseOrder> getAllPurchaseOrders() {
		return this.purchaseOrderRepository.findAll();
	}
	
	@Override
	public PurchaseOrder insertPurchaseOrder(PurchaseOrder purchaseOrder) {
		return (PurchaseOrder) this.purchaseOrderRepository.save(purchaseOrder);
	}

	@Override
	public void deletePurchaseOrder(int id) {
		purchaseOrderRepository.deleteById(id);	
	}

	



}
