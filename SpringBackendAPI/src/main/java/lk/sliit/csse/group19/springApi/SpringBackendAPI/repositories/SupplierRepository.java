package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Supplier;
/**
 * 
 * @author Dev
 *
 */
@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer>{

}
