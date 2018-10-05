package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.InvoiceRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PurchaseOrderRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.InvoiceService;

@Service
public class InvoiceServiceImplementation implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;

	@Autowired
	private Optional<Invoice> invoice;

	@Override
	public Iterable<Invoice> getAllInvoices() {
		return this.invoiceRepository.findAll();
	}

	@Override
	public Optional<Invoice> findInvoice(int id) {
		return this.invoiceRepository.findById(id);
	}
	
	@Override
	public Invoice insertInvoice(int purchaseOrderId, Invoice invoice) {
		if (purchaseOrderRepository.existsById(purchaseOrderId)) {
			invoice.setPurchaseOrderId(purchaseOrderId);
			return invoiceRepository.save(invoice);
		} else {
			// no such PurchaseOrder
			return null;
		}
	}

	@Override
	public Invoice updateInvoice(int invoiceId, Invoice invoiceDetails) {

		this.invoice = invoiceRepository.findById(invoiceId);

		if (this.invoice.isPresent()) {

			this.invoice.get().setPurchaseOrderId(invoiceDetails.getPurchaseOrderId());
			this.invoice.get().setSupplierId(invoiceDetails.getSupplierId());
			this.invoice.get().setTotalPrice(invoiceDetails.getTotalPrice());
			this.invoice.get().setInvoiceComment(invoiceDetails.getInvoiceComment());
			this.invoice.get().setIssueDate(invoiceDetails.getIssueDate());
			
			return this.invoiceRepository.save(invoice.get());	
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteInvoice(int invoiceId) {
		this.invoice = invoiceRepository.findById(invoiceId);

		if (this.invoice.isPresent()) {
			invoiceRepository.deleteById(invoiceId);
			return true;
		} else {
			return false;
		}

	}

	

}
