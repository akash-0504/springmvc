package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	private RedirectView one() {
		System.out.println("this is one hendler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

	@RequestMapping("/enjoy")
	private String two() {
		System.out.println("this is second hendler[enjoy]");
		return "contact";
		
	}

}
