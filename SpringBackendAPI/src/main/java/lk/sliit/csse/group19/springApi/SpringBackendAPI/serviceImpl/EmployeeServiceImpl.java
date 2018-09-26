package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.AuthorizedEmployeeRepo;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private AuthorizedEmployeeRepo authorizedEmployeeRepo;
	
	@Override
	public Iterable<AuthorizedEmployee> getAllEmployees() {
		return this.authorizedEmployeeRepo.findAll();
	}

}
