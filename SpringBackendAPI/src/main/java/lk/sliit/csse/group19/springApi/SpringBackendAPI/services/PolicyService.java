/**
 * 
 */
package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;

import java.util.Optional;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.Policy;

/**
 * @author Dev
 *
 */
public interface PolicyService {

	public Iterable<Policy> getAllPolicies();
	public Optional<Policy> findPolicy(int id);
	public Policy insertPolicy(String authorizedEmployeeId, Policy policy);
	public Policy updatePolicy(int policyId, Policy policyDetails);
	public boolean deletePolicy(int id);
}
