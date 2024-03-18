package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;

public class EmployeeManager implements EmployeeService{

	@Autowired
	private EmployeesDao employeesDao;
	
	public EmployeeManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public List<Employees> getAll() {
		// TODO Auto-generated method stub
		return this.employeesDao.findAll();
	}

}
