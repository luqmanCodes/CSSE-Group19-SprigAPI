package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Supplier;

/**
 * 
 * @author Dev
 *
 */
public interface SupplierService {

	public Iterable<Supplier> getAllSuppliers();
	public Supplier insertSupplier(Supplier supplier);
	public void deleteSupplier(int id);
}
