package com.wipro.FirstDemoProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class HelloController {
	
	@RequestMapping("/index")
	public String sayIndex(){
		return "index";
	}

	
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
