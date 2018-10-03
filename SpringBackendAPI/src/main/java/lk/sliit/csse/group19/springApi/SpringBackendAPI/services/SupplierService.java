package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Supplier;

/**
 * 
 * @author Dev
 *
 */
public interface SupplierService {

	public Iterable<Supplier> getAllSuppliers();
	public Optional<Supplier> findSupplier(int id);
	public Supplier insertSupplier(Supplier supplier);
	public Supplier updateSupplier(int id, Supplier supplierDetails);
	public void deleteSupplier(int id);
}
