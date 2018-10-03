/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PurchaseOrderService;

/**
 * @author Dev
 *
 */
@RestController
@RequestMapping("/purchaseOrder")
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	
	@GetMapping
	public @ResponseBody Iterable<PurchaseOrder> getAllPurchaseOrders() {
		return this.purchaseOrderService.getAllPurchaseOrders();
	}
	
	@PostMapping
	public PurchaseOrder insertPurchaseOrder(@Valid @RequestBody PurchaseOrder purchaseOrder) {
		return this.purchaseOrderService.insertPurchaseOrder(purchaseOrder);
	}
	
	@DeleteMapping("/{id}")
	public void deletePurchaseOrder(@PathVariable(value="id") int id) {
		purchaseOrderService.deletePurchaseOrder(id);
	}
}
