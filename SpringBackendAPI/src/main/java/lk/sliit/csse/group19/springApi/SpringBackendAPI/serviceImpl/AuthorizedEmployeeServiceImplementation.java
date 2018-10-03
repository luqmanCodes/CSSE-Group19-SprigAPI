/**
 * @author Dev
 */

package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.AuthorizedEmployeeRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.AuthorizedEmployeeService;


@Service
public class AuthorizedEmployeeServiceImplementation implements AuthorizedEmployeeService {

	@Autowired
	private AuthorizedEmployeeRepository authorizedEmployeeRepository;
	
	@Override
	public Iterable<AuthorizedEmployee> getAllEmployees() {
		return this.authorizedEmployeeRepository.findAll();
	}

	@Override
	public AuthorizedEmployee insertAuthorizedEmployee(AuthorizedEmployee authorizedEmployee) {
		return (AuthorizedEmployee) this.authorizedEmployeeRepository.save(authorizedEmployee);
	}

	@Override
	public void deleteAuthorizedEmployee(String id) {
		authorizedEmployeeRepository.deleteById(id);
	}

	@Override
	public AuthorizedEmployee login(String id, String password, String type) {

		Optional<AuthorizedEmployee> auth = authorizedEmployeeRepository.findByIdAndPasswordAndType(id, password, type);
		if(auth.isPresent())
			return auth.get();
		else
			return null;

	}
 
}
