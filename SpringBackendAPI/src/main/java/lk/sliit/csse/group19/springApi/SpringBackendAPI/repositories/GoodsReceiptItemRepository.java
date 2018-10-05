/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.GoodsReceiptItemId;

/**
 * @author Dev
 *
 */
@Repository
public interface GoodsReceiptItemRepository extends CrudRepository<GoodsReceiptItem, GoodsReceiptItemId> {

}
