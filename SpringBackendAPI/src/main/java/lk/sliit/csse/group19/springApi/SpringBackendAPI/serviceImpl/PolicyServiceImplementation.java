package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Policy;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.PolicyRepository;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.services.PolicyService;
/**
 * 
 * @author Dev
 *
 */
@Service
public class PolicyServiceImplementation implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;
	
	@Override
	public Iterable<Policy> getAllPolicies() {
		return this.policyRepository.findAll();
	}

	@Override
	public Policy insertPolicy(Policy policy) {
		return (Policy) this.policyRepository.save(policy);
	}

	@Override
	public void deletePolicy(int id) {
		policyRepository.deleteById(id);	
		
	}
}
