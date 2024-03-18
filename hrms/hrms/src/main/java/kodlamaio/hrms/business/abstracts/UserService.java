package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.concretes.Users;

@Service
public interface UserService {
	
	List<Users> getAll();

}
