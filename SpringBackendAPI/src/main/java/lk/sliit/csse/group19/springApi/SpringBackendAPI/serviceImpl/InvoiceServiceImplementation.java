package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.InvoiceRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.InvoiceService;

@Service
public class InvoiceServiceImplementation implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public Iterable<Invoice> getAllInvoices() {
		return this.invoiceRepository.findAll();
	}
	
	@Override
	public Invoice insertInvoice(Invoice invoice) {
		return (Invoice) this.invoiceRepository.save(invoice);
	}

	@Override
	public void deleteInvoice(int id) {
		invoiceRepository.deleteById(id);	
	}

}
