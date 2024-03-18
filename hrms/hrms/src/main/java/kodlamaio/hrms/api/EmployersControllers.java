package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.entities.concretes.Employers;
import kodlamaio.hrms.business.abstracts.EmployerService;


@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
	
	@Autowired
	private EmployerService employerService;

	public EmployersControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/api/getAll")
	 public List<Employers>getAll(){
		return this.employerService.getAll();
		 
	 }

}
