package s22.Palvelinohjelmointi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class Teht1Controller {
	
	@GetMapping("hello")
	public String heido(@RequestParam(name="name") String name, 
			@RequestParam (name="age") String age, 
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
}