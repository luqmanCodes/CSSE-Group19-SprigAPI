package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.GoodsReceiptRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.GoodsReceiptService;

@Service
public class GoodsReceiptServiceImplementation implements GoodsReceiptService {

	@Autowired
	private GoodsReceiptRepository goodsReceiptRepository;
	
	@Override
	public Iterable<GoodsReceipt> getAllGoodsReceipts() {
		return this.goodsReceiptRepository.findAll();
	}
	
	@Override
	public GoodsReceipt insertGoodsReceipt(GoodsReceipt goodsReceipt) {
		return (GoodsReceipt) this.goodsReceiptRepository.save(goodsReceipt);
	}

	@Override
	public void deleteGoodsReceipt(int id) {
		goodsReceiptRepository.deleteById(id);	
	}

}
