/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Payment;

/**
 * @author Dev
 *
 */
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
