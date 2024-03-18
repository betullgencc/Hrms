package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Employers;

@Service
public interface EmployerService {
	
	List<Employers>getAll();

}
