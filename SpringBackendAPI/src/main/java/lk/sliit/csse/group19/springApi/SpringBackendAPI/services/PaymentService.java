package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Payment;

public interface PaymentService {

	public Iterable<Payment> getAllPayments();
	public Optional<Payment> findPayment(int id);
	public Payment insertPayment(int purchaseOrderId, Payment payment);
	public Payment updatePayment(int supplierId, Payment paymentDetails);
	public boolean deletePayment(int id);
}
