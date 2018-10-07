/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Payment;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PaymentService;

/**
 * @author Dev
 *
 */
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	
	@GetMapping("/payments")
	public @ResponseBody Iterable<Payment> getAllPayments() {
		return this.paymentService.getAllPayments();
	}
	
	@GetMapping("/payments/{paymentId}")
	public Optional<Payment> findPayment(@PathVariable(value="paymentId")int paymentId) {
		return this.paymentService.findPayment(paymentId);
	}
	
	@PostMapping("/suppliers/{supplierId}/payments")
	public Payment insertPayment(@PathVariable(value="supplierId")int supplierId, @Valid @RequestBody Payment paymentDetails) {
		return this.paymentService.insertPayment(supplierId, paymentDetails);
	}
	
	@PutMapping("/payments/{paymentId}")
	public Payment updatePayment(@PathVariable(value="paymentId") int paymentId, @Valid @RequestBody Payment paymentDetails){
		return this.paymentService.updatePayment(paymentId, paymentDetails);	
	}
	
	@DeleteMapping("/payments/{id}")
	public boolean deletePayment(@PathVariable(value="id") int id) {
		return paymentService.deletePayment(id);
	}
}
