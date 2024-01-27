package com.wipro.FirstDemoProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class MovieController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello"; // logical view name "hello" gets mapped to physical view name "hello.html"
						// under the /src/java/resources/templates folder
	}

	// data is being sent from the controller to the view using the ModelAndView object
	@RequestMapping("/movie")
	public ModelAndView getMovies() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("movieName", "Top Gun"); // Adding data into the model
		mv.addObject("movieActor", "Tom Cruise"); // Adding data into the model
		mv.setViewName("movie"); // Adding the logical view name which can display the model data.
								 // Thymeleaf maps it to movie.html
		return mv;
	}

}
