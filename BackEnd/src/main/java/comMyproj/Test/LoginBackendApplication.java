package comMyproj.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LoginBackendApplication.class, args);
	}
	
	
	@Autowired
	private UserDataCrud crud;
	
	@Override
	public void run(String... args) throws Exception {
//		UserDataTable user=new UserDataTable();
//		user.setUserName("Fadi@gmail.com");
//		user.setPassWord("fadi123");
//		user.setSecretCode("123Fadi");
//		crud.save(user);
	}
}
