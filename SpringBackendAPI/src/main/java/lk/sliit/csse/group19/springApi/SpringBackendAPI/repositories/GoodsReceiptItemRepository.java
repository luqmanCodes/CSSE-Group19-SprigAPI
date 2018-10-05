/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItemId;

/**
 * @author Dev
 *
 */
@Repository
public interface GoodsReceiptItemRepository extends CrudRepository<GoodsReceiptItem, GoodsReceiptItemId> {

	@Query(value="select gr.item_id ,i.name,gr.quantity from goods_receipt_item gr,item i where gr.item_id=i.id and gr.goods_receipt_id = (:goodsReciptId)",nativeQuery=true)
	public List<Object> customfindByGoodsReciptItems(@Param(value="goodsReciptId")int goodsReciptId);
}
