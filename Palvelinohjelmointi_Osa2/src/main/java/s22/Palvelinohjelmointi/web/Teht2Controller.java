package s22.Palvelinohjelmointi.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import s22.Palvelinohjelmointi.domain.Student;


@Controller
public class Teht2Controller {
	
	@GetMapping("opiskelijat")
	public String showStudents(Model model) {
		
//		model.addAttribute("Opiskelija1", new Student("Vi", "Aa"));
//		model.addAttribute("Opiskelija2", new Student("Vi2", "Aa2"));
//		model.addAttribute("Opiskelija3", new Student("Vi3", "Aa3"));
		
		ArrayList<Student> opiskelijat = new ArrayList<>();
		
		opiskelijat.add(new Student("Pekka", "Pouta"));
		opiskelijat.add(new Student("Jukka", "Kujala"));
		opiskelijat.add(new Student("Maija", "Meikalainen"));
		
		model.addAttribute("studentsList", opiskelijat);
		
		return "students";
	}

}