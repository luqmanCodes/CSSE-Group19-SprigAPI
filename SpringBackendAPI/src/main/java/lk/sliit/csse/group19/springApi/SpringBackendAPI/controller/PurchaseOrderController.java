/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.GoodsReceiptRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.GoodsReceiptService;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PurchaseOrderService;

/**
 * @author Dev
 *
 */
@RestController
@RequestMapping("/purchaseOrders")
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService purchaseOrderService;
	@Autowired
	private GoodsReceiptService goodsReceiptService;
	
	@GetMapping
	public @ResponseBody Iterable<PurchaseOrder> getAllPurchaseOrders() {
		return this.purchaseOrderService.getAllPurchaseOrders();
	}
	
	@PostMapping(consumes="application/json")
	public PurchaseOrder insertPurchaseOrder(@RequestBody Map<String,Object> purchaseOrder) {
		return this.purchaseOrderService.insertPurchaseOrder(purchaseOrder);
	}
	
	@DeleteMapping("/{id}")
	public void deletePurchaseOrder(@PathVariable(value="id") int id) {
		purchaseOrderService.deletePurchaseOrder(id);
	}
	@GetMapping("/bySiteManagerId")
	public @ResponseBody Iterable<PurchaseOrder> getPurchaseOrdersBySiteManagerIdAndStatus(@RequestParam String siteManagerId,@RequestParam String status) {
		return this.purchaseOrderService.getPurchaseOrdersBySiteMangerIdAndStatus(siteManagerId, status);
	}
	@GetMapping("/{id}/goodsRecipts")
	public @ResponseBody Iterable<GoodsReceipt> getGoodsReciptsByPurchaseOrderId(@PathVariable(value="id") int id,@RequestParam String status) {
		return goodsReceiptService.getGoodsReciptsByPurchaseOrderIdAndStatus(id, status);
	}
}
