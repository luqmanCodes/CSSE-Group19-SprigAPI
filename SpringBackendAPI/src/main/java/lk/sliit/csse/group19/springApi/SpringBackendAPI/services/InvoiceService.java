package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;

/**
 * @author Dev
 *
 */
public interface InvoiceService {

	public Iterable<Invoice> getAllInvoices();
	public Optional<Invoice> findInvoice(int id);
	public Invoice insertInvoice(int purchaseOrderId, Invoice invoice);
	public Invoice updateInvoice(int invoiceId, Invoice invoiceDetails);
	public boolean deleteInvoice(int id);
}
