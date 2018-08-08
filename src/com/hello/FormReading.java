package com.hello;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.model.Employee;

@Controller
@RequestMapping("/form")
public class FormReading {
	
	@Value("#{departmentNames}")
	private Map<String, String> departments;
	
	@RequestMapping("/read")
	public String read(Model model) {
		
		model.addAttribute("emp", new Employee());
		
		model.addAttribute("departments", departments);
		
		return "readform";
	}
	
	@RequestMapping("/write")
	public String write(@Valid @ModelAttribute("emp") Employee empl) {
		
			return "writeform";
	}

}
