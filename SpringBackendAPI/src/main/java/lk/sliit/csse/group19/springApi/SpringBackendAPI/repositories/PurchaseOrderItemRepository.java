package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItemId;

@Repository
public interface PurchaseOrderItemRepository extends JpaRepository<PurchaseOrderItem, PurchaseOrderItemId> {
	
	@Query(value="select poi.item_id,i.name,poi.quantity from item i,purchase_order_item poi where i.id = poi.Item_id and poi.purchase_order_id = (:purchaseOrderItemId)",nativeQuery=true)
	public List<Object> customfindByPurchaseOrderItems(@Param(value="purchaseOrderItemId")int purchaseOrderItemId );
}
