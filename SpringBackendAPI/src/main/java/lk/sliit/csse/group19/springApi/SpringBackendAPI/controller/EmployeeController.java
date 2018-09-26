package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeController employeeController;
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<AuthorizedEmployee> getAllEmployees() {
		return this.employeeController.getAllEmployees();
	}
}
