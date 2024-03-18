package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Employees;

@Service
public interface EmployeeService {
	List<Employees> getAll();

}
