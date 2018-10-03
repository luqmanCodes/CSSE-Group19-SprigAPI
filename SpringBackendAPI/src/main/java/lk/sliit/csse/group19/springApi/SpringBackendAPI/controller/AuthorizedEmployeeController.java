/**
 * @author Dev
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
