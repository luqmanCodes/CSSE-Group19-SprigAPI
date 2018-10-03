/**
 * @author Dev
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withNoContent;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.AuthorizedEmployeeService;

@RestController
@RequestMapping("/authorizedEmployee")
public class AuthorizedEmployeeController {
	
	@Autowired
	private AuthorizedEmployeeService authorizedEmployeeService;
	
	@GetMapping
	public @ResponseBody Iterable<AuthorizedEmployee> getAllEmployees() {
		return this.authorizedEmployeeService.getAllEmployees();
	}
	
	@PostMapping
	public AuthorizedEmployee insertAuthorizedEmployee(@Valid @RequestBody AuthorizedEmployee authorizedEmployee) {
		return this.authorizedEmployeeService.insertAuthorizedEmployee(authorizedEmployee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAuthorizedEmployee(@PathVariable(value="id") String id) {
		authorizedEmployeeService.deleteAuthorizedEmployee(id);
	}
	@PostMapping(value="/login", consumes="application/json")
	public @ResponseBody AuthorizedEmployee login(@RequestBody Map<String,Object> body) throws Exception {
		String id = (String) body.get("id");
		String password = (String) body.get("password");
		String type = (String) body.get("type");
		AuthorizedEmployee au1 =  authorizedEmployeeService.login(id, password,type);
		if(au1 == null) 
			throw new RuntimeException("NO CONTENT");
		
		return au1;
	}
	
}
