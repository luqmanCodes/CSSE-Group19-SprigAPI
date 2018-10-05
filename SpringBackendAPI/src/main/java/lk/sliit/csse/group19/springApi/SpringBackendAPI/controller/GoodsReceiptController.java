/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.GoodsReceiptService;

/**
 * @author Dev
 *
 */
@RestController
public class GoodsReceiptController {

	@Autowired
	private GoodsReceiptService goodsReceiptService;
	
	
	@GetMapping("/goodsReceipts")
	public @ResponseBody Iterable<GoodsReceipt> getAllGoodsReceipts() {
		return this.goodsReceiptService.getAllGoodsReceipts();
	}
	
	@GetMapping("/goodsReceipts/{goodsReceiptId}")
	public Optional<GoodsReceipt> findInvoice(@PathVariable(value="goodsReceiptId")int goodsReceiptId) {
		return this.goodsReceiptService.findGoodsReceipt(goodsReceiptId);
	}
	
	@PostMapping("/purchaseOrders/{purchaseOrderId}/goodsReceipts")
	public GoodsReceipt insertGoodsReceipt(@PathVariable(value="purchaseOrderId") int purchaseOrderId, @Valid @RequestBody GoodsReceipt goodsReceipt) {
		return this.goodsReceiptService.insertGoodsReceipt(purchaseOrderId, goodsReceipt);
	}
	
	@PutMapping("/goodsReceipts/{goodsReceiptId}")
	public GoodsReceipt updateGoodsReceipt(@PathVariable(value="goodsReceiptId") int goodsReceiptId, @Valid @RequestBody GoodsReceipt goodsReceiptDetails){
		return this.goodsReceiptService.updateGoodsReceipt(goodsReceiptId, goodsReceiptDetails);	
	}
	
	
	@DeleteMapping("/{id}")
	public boolean deleteGoodsReceipt(@PathVariable(value="id") int id) {
		return goodsReceiptService.deleteGoodsReceipt(id);
	}
}
