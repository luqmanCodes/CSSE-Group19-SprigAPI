package lk.sliit.csse.group19.springApi.SpringBackendAPI.repositories;

import org.springframework.data.repository.CrudRepository;

import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

public interface AuthorizedEmployeeRepo extends CrudRepository<AuthorizedEmployee, String> {

}
