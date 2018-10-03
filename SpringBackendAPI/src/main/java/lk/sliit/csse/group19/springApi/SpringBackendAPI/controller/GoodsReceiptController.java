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

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.GoodsReceiptService;

/**
 * @author Dev
 *
 */
@RestController
@RequestMapping("/goodsReceipt")
public class GoodsReceiptController {

	@Autowired
	private GoodsReceiptService goodsReceiptService;
	
	
	@GetMapping
	public @ResponseBody Iterable<GoodsReceipt> getAllGoodsReceipts() {
		return this.goodsReceiptService.getAllGoodsReceipts();
	}
	
	@PostMapping
	public GoodsReceipt insertGoodsReceipt(@Valid @RequestBody GoodsReceipt goodsReceipt) {
		return this.goodsReceiptService.insertGoodsReceipt(goodsReceipt);
	}
	
	@DeleteMapping("/{id}")
	public void deleteGoodsReceipt(@PathVariable(value="id") int id) {
		goodsReceiptService.deleteGoodsReceipt(id);
	}
}
