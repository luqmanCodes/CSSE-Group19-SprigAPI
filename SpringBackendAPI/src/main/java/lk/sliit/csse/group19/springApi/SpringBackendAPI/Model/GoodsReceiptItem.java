package lk.sliit.csse.group19.springApi.SpringBackendAPI.Model;

/**
 * 
 * @author Dev
 *
 */

public class GoodsReceiptItem {

	private int goodsReceiptId;
	private int itemId;
	
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
