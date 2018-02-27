package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
	@RequestMapping(value="/getPersonalInfo")
	public List<String> getPersonalInfo() {
		List<String> personalDetails = new ArrayList<String>();
		personalDetails.add("Mitchell Irvin");
		personalDetails.add("Alma Mater: University of Florida");
		personalDetails.add("Hobbies: Reading, Lifting, Learning");
		return personalDetails; 
	}
    
}
