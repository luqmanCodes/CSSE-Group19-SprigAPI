/**
 * @author Dev
 */

package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

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
	
	@Autowired 
	private Optional<AuthorizedEmployee> authorizedEmployee;
	
	@Override
	public Iterable<AuthorizedEmployee> getAllEmployees() {
		return this.authorizedEmployeeRepository.findAll();
	}
	
	@Override
	public Optional<AuthorizedEmployee> findAuthorizedEmployee(String id) {		
		return this.authorizedEmployeeRepository.findById(id);
	}

	@Override
	public AuthorizedEmployee insertAuthorizedEmployee(AuthorizedEmployee authorizedEmployee) {
		return (AuthorizedEmployee) this.authorizedEmployeeRepository.save(authorizedEmployee);
	}

	@Override
	public AuthorizedEmployee updateAuthorizedEmployee(String id, AuthorizedEmployee authorizedEmployeeDetails) {
		
		if(authorizedEmployeeRepository.findById(id).isPresent()) {
			this.authorizedEmployee = authorizedEmployeeRepository.findById(id);
			
			authorizedEmployee.get().setName(authorizedEmployeeDetails.getName());
			authorizedEmployee.get().setMobileNumber(authorizedEmployeeDetails.getMobileNumber());
			authorizedEmployee.get().setType(authorizedEmployeeDetails.getType());
			
			return this.authorizedEmployeeRepository.save(authorizedEmployee.get());
					
		} else {
			return null;
		}
		
	}
	
	@Override
	public void deleteAuthorizedEmployee(String id) {
		authorizedEmployeeRepository.deleteById(id);
	}

}
