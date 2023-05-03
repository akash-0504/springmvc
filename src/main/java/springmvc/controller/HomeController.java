package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/first", method=RequestMethod.GET)
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Akash Bairagi is software developer");
		model.addAttribute("id", 2345);

		List<String> friends = new ArrayList<String>();
		friends.add("Rahul");
		friends.add("rakesh");
		friends.add("vijay");
		friends.add("IPL");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//Creating model and view object
		ModelAndView modelAndView = new ModelAndView();
        
		//Setting the data 
		modelAndView.addObject("name", "Raj kapoor");
		modelAndView.addObject("rollnumber ", 123456);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks 
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(456);
		list.add(23);
		list.add(12346);
		list.add(888888);
		list.add(8979);
		
		modelAndView.addObject("marks", list);
		//setting the view name
		modelAndView.setViewName("help");
		
			return modelAndView;
	}

}
