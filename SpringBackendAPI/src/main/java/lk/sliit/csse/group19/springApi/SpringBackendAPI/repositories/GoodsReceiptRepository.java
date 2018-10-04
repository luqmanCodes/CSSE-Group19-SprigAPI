/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceipt;

/**
 * @author Mom
 *
 */
@Repository
public interface GoodsReceiptRepository extends CrudRepository<GoodsReceipt, Integer> {
	public Iterable<GoodsReceipt> findByPurchaseOrderIdAndStatus(int purchaseOrderId,String status);
}
