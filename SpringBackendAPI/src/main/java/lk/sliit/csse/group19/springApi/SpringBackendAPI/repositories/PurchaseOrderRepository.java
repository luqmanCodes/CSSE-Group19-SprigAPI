/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.PurchaseOrder;

/**
 * @author dev
 *
 */
@Repository
public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Integer> {

}
