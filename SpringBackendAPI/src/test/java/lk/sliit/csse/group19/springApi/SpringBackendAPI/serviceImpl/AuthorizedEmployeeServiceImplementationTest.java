package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import static org.junit.Assert.*;

import java.util.Optional;

import org.aspectj.lang.annotation.After;
import org.junit.Before;
import org.junit.Test;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

public class AuthorizedEmployeeServiceImplementationTest {


	private AuthorizedEmployeeServiceImplementation authorizedEmployeeServiceImplementation;

	private AuthorizedEmployee authorizedEmployee;
	
	@Before
	public void initialize() {
		authorizedEmployeeServiceImplementation = new AuthorizedEmployeeServiceImplementation();

		authorizedEmployee = new AuthorizedEmployee();
		authorizedEmployee.setId("mg2");
		authorizedEmployee.setName("David");
		authorizedEmployee.setPassword("davidadmin");
		authorizedEmployee.setType("Manager");
		authorizedEmployee.setMobileNumber("0771234567");
	}
	
	@Test
	public void insertAuthorizedEmployeeTest() {
		
		AuthorizedEmployee ae = authorizedEmployeeServiceImplementation.insertAuthorizedEmployee(authorizedEmployee);
		System.out.println(ae);
		assertEquals("David", ae.getName());
	}
	
	@Test
	public void findAuthorizedEmployeeTest() {
		
		Optional<AuthorizedEmployee> ae = authorizedEmployeeServiceImplementation.findAuthorizedEmployee("mg2");
		System.out.println(ae);
		assertEquals("David", ae.get().getName());
	}
	
	
	@Test 
	public void deleteAuthorizedEmployeeTest() {
		authorizedEmployeeServiceImplementation.deleteAuthorizedEmployee("mg2");
		assertNotEquals("David", authorizedEmployeeServiceImplementation.findAuthorizedEmployee("mg2").get().getName());
	}
}
