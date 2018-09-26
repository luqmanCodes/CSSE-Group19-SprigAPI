package lk.sliit.csse.group19.springApi.SpringBackendAPI.services;
import lk.sliit.csse.group19.springApi.SpringBackendAPI.Model.AuthorizedEmployee;

public interface EmployeeService {
	public Iterable<AuthorizedEmployee> getAllEmployees();
}
