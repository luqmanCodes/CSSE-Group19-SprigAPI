package lk.sliit.csse.group19.springApi.SpringBackendAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
