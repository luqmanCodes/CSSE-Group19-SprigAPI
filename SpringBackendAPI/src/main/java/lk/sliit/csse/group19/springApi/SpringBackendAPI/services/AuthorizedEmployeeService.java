/**
 * @author Dev
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

public interface AuthorizedEmployeeService {
	public Iterable<AuthorizedEmployee> getAllEmployees();
}
