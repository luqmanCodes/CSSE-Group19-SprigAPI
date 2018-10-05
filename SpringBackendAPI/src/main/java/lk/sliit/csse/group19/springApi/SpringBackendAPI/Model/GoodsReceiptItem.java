package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * 
 * @author Dev
 *
 */
@Entity
public class GoodsReceiptItem {

	@EmbeddedId
	private GoodsReceiptItemId goodsReceiptItemId;
	private int quantity;
	
	
	public GoodsReceiptItem(GoodsReceiptItemId goodsReceiptItemId, int quantity) {
		super();
		this.goodsReceiptItemId = goodsReceiptItemId;
		this.quantity = quantity;
	}
	
	public GoodsReceiptItem() {
		
	}
	public GoodsReceiptItemId getGoodsReceiptItemId() {
		return goodsReceiptItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setGoodsReceiptItemId(GoodsReceiptItemId goodsReceiptItemId) {
		this.goodsReceiptItemId = goodsReceiptItemId;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
