package com.wipro.FirstDemoProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class HelloController {

/*	
	@RequestMapping("/")
	public String sayHello(){
		return "Welocme to First Demo Project";
	}
*/
	
	@RequestMapping("/name")
	public String sayName(){
		return "name"; // logical view name "name" gets mapped to physical view name "name.html"
		               //under the /src/java/resources/templates folder
	}

	@RequestMapping("/city")
	//@ResponseBody
	public String sayCity(){
		return "city"; // logical view name "city" gets mapped to physical view name "city.html"
                       //under the /src/java/resources/templates folder
	}

	
}
