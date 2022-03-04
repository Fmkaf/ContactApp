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
@RequestMapping("/api/Contact")
public class ContactController {
	@Autowired
	ContactCrud crud;
	
	@GetMapping
	public List<ContactTable> getContactDetails(){
		return crud.findAll();
	}
	
	@PostMapping
	public ContactTable createContact(@RequestBody ContactTable table) {
		return crud.save(table);
	}
}
