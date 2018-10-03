package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Supplier;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.SupplierRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SupplierService;

@Service
public class SupplierServiceImplementation implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired 
	private Optional<Supplier> supplier;
	
	@Override
	public Iterable<Supplier> getAllSuppliers() {
		return this.supplierRepository.findAll();
	}
	
	@Override
	public Optional<Supplier> findSupplier(int id) {		
		return this.supplierRepository.findById(id);
	}

	@Override
	public Supplier insertSupplier(Supplier supplier) {
		return (Supplier) this.supplierRepository.save(supplier);
	}

	@Override
	public void deleteSupplier(int id) {
		supplierRepository.deleteById(id);	
	}
	
	@Override
	public Supplier updateSupplier(int id, Supplier supplierDetails) {
		
		if(supplierRepository.findById(id).isPresent()) {
			this.supplier = supplierRepository.findById(id);
			
			supplier.get().setName(supplierDetails.getName());
			supplier.get().setAddress(supplierDetails.getAddress());
			supplier.get().setPhoneNumber(supplierDetails.getPhoneNumber());
			supplier.get().setEmail(supplierDetails.getEmail());
			supplier.get().setBankAccountNumber(supplierDetails.getBankAccountNumber());
			
			return this.supplierRepository.save(supplier.get());
					
		} else {
			return null;
		}
		
	}
}
