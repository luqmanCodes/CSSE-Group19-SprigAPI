package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;

/**
 * @author Dev
 *
 */
public interface GoodsReceiptService {

	public Iterable<GoodsReceipt> getAllGoodsReceipts();
	public GoodsReceipt insertGoodsReceipt(GoodsReceipt goodsReceipt);
	public void deleteGoodsReceipt(int id);
}
