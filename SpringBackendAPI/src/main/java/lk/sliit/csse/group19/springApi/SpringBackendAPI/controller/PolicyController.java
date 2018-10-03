package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Policy;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PolicyService;

/**
 * 
 * @author Dev
 *
 */
@RestController
@RequestMapping("/policy")
public class PolicyController {

	@Autowired
	private PolicyService policyService;
	
	@GetMapping
	public @ResponseBody Iterable<Policy> getAllPolicies(){
			return this.policyService.getAllPolicies();
	}
	
	@PostMapping
	public Policy insertPolicy(@Valid @RequestBody Policy policy) {
		return this.policyService.insertPolicy(policy);
	}
	
	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable(value="id") int id) {
		policyService.deletePolicy(id);
	}
}
