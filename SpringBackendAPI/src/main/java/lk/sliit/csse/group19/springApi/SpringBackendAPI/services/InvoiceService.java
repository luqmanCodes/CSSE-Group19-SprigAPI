package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;

/**
 * @author Dev
 *
 */
public interface InvoiceService {

	public Iterable<Invoice> getAllInvoices();
	public Invoice insertInvoice(Invoice invoice);
	public void deleteInvoice(int id);
}
