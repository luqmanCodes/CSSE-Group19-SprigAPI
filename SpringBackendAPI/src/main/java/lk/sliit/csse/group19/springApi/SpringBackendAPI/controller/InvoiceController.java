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

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.InvoiceService;

/**
 * @author Dev
 *
 */
@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	
	@GetMapping("/invoices")
	public @ResponseBody Iterable<Invoice> getAllInvoices() {
		return this.invoiceService.getAllInvoices();
	}
	
	@GetMapping("/invoices/{invoiceId}")
	public Optional<Invoice> findInvoice(@PathVariable(value="invoiceId")int invoiceId) {
		return this.invoiceService.findInvoice(invoiceId);
	}
	
	@PostMapping("/purchaseOrders/{purchaseOrderId}/invoices")
	public Invoice insertInvoice(@PathVariable(value="purchaseOrderId")int purchaseOrderId, @Valid @RequestBody Invoice invoice) {
		return this.invoiceService.insertInvoice(purchaseOrderId, invoice);
	}
	
	@PutMapping("/sites/{invoiceId}")
	public Invoice updateInvoice(@PathVariable(value="invoiceId") int invoiceId, @Valid @RequestBody Invoice invoiceDetails){
		return this.invoiceService.updateInvoice(invoiceId, invoiceDetails);	
	}
	
	@DeleteMapping("/invoices/{id}")
	public void deleteInvoice(@PathVariable(value="id") int id) {
		invoiceService.deleteInvoice(id);
	}
}
