package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Item;

/**
 * 
 * @author Dev
 *
 */
@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{

}
