/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Invoice;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.InvoiceService;

/**
 * @author Dev
 *
 */
@RestController
@RequestMapping("/invoices")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	
	@GetMapping
	public @ResponseBody Iterable<Invoice> getAllInvoices() {
		return this.invoiceService.getAllInvoices();
	}
	
	@PostMapping
	public Invoice insertInvoice(@Valid @RequestBody Invoice invoice) {
		return this.invoiceService.insertInvoice(invoice);
	}
	
	@DeleteMapping("/{id}")
	public void deleteInvoice(@PathVariable(value="id") int id) {
		invoiceService.deleteInvoice(id);
	}
}
