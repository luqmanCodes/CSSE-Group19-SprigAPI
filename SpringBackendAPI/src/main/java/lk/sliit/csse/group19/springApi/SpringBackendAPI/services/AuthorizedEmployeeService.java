/**
 * @author Dev
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;
import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

public interface AuthorizedEmployeeService {
	
	public Iterable<AuthorizedEmployee> getAllEmployees();
	public Optional<AuthorizedEmployee> findAuthorizedEmployee(String id);
	public AuthorizedEmployee insertAuthorizedEmployee(AuthorizedEmployee authorizedEmployee);
	public AuthorizedEmployee updateAuthorizedEmployee(String id, AuthorizedEmployee authorizedEmployeeDetails);
	public void deleteAuthorizedEmployee(String id);
	public AuthorizedEmployee login(String id,String password,String type);
}
