package kodlamaio.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.Users;

import java.util.List;

@RestController
@RequestMapping
public class UsersContollers {
	
	
	@Autowired
	private UserService userService;
	
	public UsersContollers(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getAll")
	public List <Users> getAll(){
		
		return this.userService.getAll();
		
		
	}

}
