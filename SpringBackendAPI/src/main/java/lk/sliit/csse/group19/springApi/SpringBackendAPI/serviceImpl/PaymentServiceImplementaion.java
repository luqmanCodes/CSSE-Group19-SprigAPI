/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Payment;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PaymentRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.SupplierRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PaymentService;

/**
 * @author Dev
 *
 */
@Service
public class PaymentServiceImplementaion implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private Optional<Payment> payment;

	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public Iterable<Payment> getAllPayments() {
		return this.paymentRepository.findAll();
	}

	@Override
	public Optional<Payment> findPayment(int id) {
		return this.paymentRepository.findById(id);
	}

	@Override
	public Payment insertPayment(int supplierId, Payment payment) {
		if (supplierRepository.existsById(supplierId)) {
			payment.setSupplier(supplierRepository.findById(supplierId).get());
			return paymentRepository.save(payment);
		} else {
			// no such Supplier
			return null;
		}
	}

	@Override
	public Payment updatePayment(int paymentId, Payment paymentDetails) {
		
		if (paymentRepository.existsById(paymentId)) {
			this.payment = paymentRepository.findById(paymentId);
			
			this.payment.get().setAuthorizedEmployee(paymentDetails.getAuthorizedEmployee());;
			this.payment.get().setInvoiceId(paymentDetails.getInvoiceId());
			this.payment.get().setStatus(paymentDetails.getStatus());
			this.payment.get().setSupplier(paymentDetails.getSupplier());
			
			return paymentRepository.save(payment.get());
		} else {
			return null;
		}
	}

	@Override
	public boolean deletePayment(int id) {
		if (paymentRepository.existsById(id)) {
			this.payment = paymentRepository.findById(id);
			paymentRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
