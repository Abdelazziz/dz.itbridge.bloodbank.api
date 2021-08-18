package dz.itbridge.bloodbank.api.controler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("**")
public class UserControler {
	
	@RequestMapping("/")
	public String getUser ()  {
		return "Login is Done";
	}

}
