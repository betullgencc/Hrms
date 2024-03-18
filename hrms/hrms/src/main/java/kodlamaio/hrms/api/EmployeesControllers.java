package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControllers {

	@Autowired
	private EmployeeService employeeService;

	public EmployeesControllers(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAll")
	List<Employees>getAll(){
		
		return this.employeeService.getAll();
		
	}
	
}
