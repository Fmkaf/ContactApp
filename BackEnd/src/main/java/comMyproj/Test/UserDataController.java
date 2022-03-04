package comMyproj.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/SignUp")
public class UserDataController {
	@Autowired
	UserDataCrud crud;
	
	@GetMapping
	public List<UserDataTable> getUserData(){
		return crud.findAll();
	}
	
	@PostMapping
	public UserDataTable createUserData(@RequestBody UserDataTable userData){
		return crud.save(userData);
	}
}
