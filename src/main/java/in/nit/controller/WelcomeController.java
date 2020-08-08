package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@SuppressWarnings("null")
	@RequestMapping("/welcome")
	public String showPage(Model model, String name) {
		model.addAttribute("wsg","hello welcome");
		String name1 = null;
		name1.length();
		return "welcome";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerException(Model model) {
		model.addAttribute("web","some problem occured");
		return "error";
	}
	
}
