package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Supplier;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.SupplierRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.SupplierService;

@Service
public class SupplierServiceImplementation implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Override
	public Iterable<Supplier> getAllSuppliers() {
		return this.supplierRepository.findAll();
	}

}
