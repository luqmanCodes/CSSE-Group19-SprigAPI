/**
 * @author Dev
 */

package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

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

}
