package lk.sliit.csse.group19.springApi.SpringBackendAPI.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Policy;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories.AuthorizedEmployeeRepository;
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
	
	@Autowired
	private Optional<Policy> policy;
	
	@Autowired
	private AuthorizedEmployeeRepository authorizedEmployeeRepository;
	
	@Override
	public Iterable<Policy> getAllPolicies() {
		return this.policyRepository.findAll();
	}

	@Override
	public Optional<Policy> findPolicy(int id) {
		return this.policyRepository.findById(id);
	}

	@Override
	public Policy insertPolicy(String authorizedEmployeeId, Policy policy) {
		if(authorizedEmployeeRepository.existsById(authorizedEmployeeId)) {
			policy.setAuthorizedEmployee(authorizedEmployeeRepository.findById(authorizedEmployeeId).get());
			return policyRepository.save(policy);
		} else {
			// no such employee
			return null;
		}
	}

	@Override
	public Policy updatePolicy(int policyId, Policy policyDetails) {

		this.policy = policyRepository.findById(policyId);
		
		if(this.policy.isPresent()) {
			if(policyDetails.getType() != null)
				this.policy.get().setType(policyDetails.getType());
			if(policyDetails.getValue() != 0)
				this.policy.get().setValue(policyDetails.getValue());
			return this.policyRepository.save(policy.get());
		} else {
			return null;
		}
	}

	@Override
	public boolean deletePolicy(int policyId) {
		this.policy = policyRepository.findById(policyId);
		
		if(this.policy.isPresent()) {
			policyRepository.deleteById(policyId);
			return true;
		} else {
			return false;
		}
			
	}

}
