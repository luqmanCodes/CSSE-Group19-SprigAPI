package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class PolicyController {

	@Autowired
	private PolicyService policyService;
	
	@GetMapping("/policies")
	public @ResponseBody Iterable<Policy> getAllPolicies(){
			return this.policyService.getAllPolicies();
	}
	
	@GetMapping("/policies/{policyId}")
	public @ResponseBody Optional<Policy> findPolicy(@PathVariable(value="policyId") int policyId){
			return this.policyService.findPolicy(policyId);
	}
	
	@PostMapping("/authorizedEmployees/{authorizedEmployeeId}/policies")
	public Policy insertPolicy(@PathVariable(value="authorizedEmployeeId") String authorizedEmployeeId, @Valid @RequestBody Policy policy) {
		return this.policyService.insertPolicy(authorizedEmployeeId, policy);
	}
	
	@PutMapping("/policies/{policyId}")
	public Policy updatePolicy(@PathVariable(value="policyId") int policyId, @Valid @RequestBody Policy policyDetails){
		return this.policyService.updatePolicy(policyId, policyDetails);	
	}
	
	@DeleteMapping("policies/{policyId}")
	public boolean deletePolicy(@PathVariable(value="policyId") int policyId) {
		return policyService.deletePolicy(policyId);
	}
}
