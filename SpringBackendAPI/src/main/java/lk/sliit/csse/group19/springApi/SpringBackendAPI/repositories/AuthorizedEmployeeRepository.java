package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dev
 */
@Repository
public interface AuthorizedEmployeeRepository extends CrudRepository<AuthorizedEmployee, String> {

	public Optional<AuthorizedEmployee> findByIdAndPasswordAndType(String id,String password,String type);
}
