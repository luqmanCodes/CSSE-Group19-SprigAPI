/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author Dev
 *
 */
@Embeddable
public class GoodsReceiptItemId implements Serializable {
	
	private int goodsReceiptId;
	private int itemId;
	
	public GoodsReceiptItemId() {
		
	}
	
	public GoodsReceiptItemId(int goodsReceiptId, int itemId) {
		super();
		this.goodsReceiptId = goodsReceiptId;
		this.itemId = itemId;
	}
	public int getGoodsReceiptId() {
		return goodsReceiptId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setGoodsReceiptId(int goodsReceiptId) {
		this.goodsReceiptId = goodsReceiptId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
}
