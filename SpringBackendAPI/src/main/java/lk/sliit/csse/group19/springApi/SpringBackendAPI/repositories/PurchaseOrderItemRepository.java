package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItem;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrderItemId;

@Repository
public interface PurchaseOrderItemRepository extends CrudRepository<PurchaseOrderItem, PurchaseOrderItemId> {

}
