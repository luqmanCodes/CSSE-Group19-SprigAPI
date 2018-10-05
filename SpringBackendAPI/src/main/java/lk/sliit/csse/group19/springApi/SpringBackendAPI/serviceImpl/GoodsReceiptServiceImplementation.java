package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.GoodsReceiptRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PurchaseOrderRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.GoodsReceiptService;

@Service
public class GoodsReceiptServiceImplementation implements GoodsReceiptService {

	@Autowired
	private GoodsReceiptRepository goodsReceiptRepository;

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;

	@Autowired
	private Optional<GoodsReceipt> goodsReceipt;

	@Override
	public Iterable<GoodsReceipt> getAllGoodsReceipts() {
		return this.goodsReceiptRepository.findAll();
	}

	@Override
	public Optional<GoodsReceipt> findGoodsReceipt(int id) {
		return this.goodsReceiptRepository.findById(id);
	}

	@Override
	public boolean deleteGoodsReceipt(int id) {
		this.goodsReceipt = goodsReceiptRepository.findById(id);

		if (this.goodsReceipt.isPresent()) {
			goodsReceiptRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Iterable<GoodsReceipt> getGoodsReciptsByPurchaseOrderIdAndStatus(int purchaseOrderId, String status) {
		return goodsReceiptRepository.findByPurchaseOrderIdAndStatus(purchaseOrderId, status);
	}

	@Override
	public GoodsReceipt insertGoodsReceipt(int purchaseOrderId, GoodsReceipt goodsReceipt) {
		if (purchaseOrderRepository.existsById(purchaseOrderId)) {
			goodsReceipt.setPurchaseOrderId(purchaseOrderId);
			return goodsReceiptRepository.save(goodsReceipt);
		} else {
			// no such PurchaseOrder
			return null;
		}
	}

	@Override
	public GoodsReceipt updateGoodsReceipt(int id, GoodsReceipt goodsReceiptDetails) {
		if (this.goodsReceipt.isPresent()) {

			this.goodsReceipt.get().setPurchaseOrderId(goodsReceiptDetails.getPurchaseOrderId());
			this.goodsReceipt.get().setSupplierId(goodsReceiptDetails.getSupplierId());
			this.goodsReceipt.get().setStatus(goodsReceiptDetails.getStatus());
			this.goodsReceipt.get().setGoodsReceiptComment(goodsReceiptDetails.getGoodsReceiptComment());
			this.goodsReceipt.get().setIssueDate(goodsReceiptDetails.getIssueDate());

			return this.goodsReceiptRepository.save(goodsReceipt.get());
		} else {
			return null;
		}
	}
}
