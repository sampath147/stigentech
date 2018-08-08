package com.hello;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/read")
	public String readCustomer(Model model) {
		
		model.addAttribute("customer", new Customer());
		
		return "readcustomer";
	}
	
	@RequestMapping("/write")
	public String writeCustomer(@Valid @ModelAttribute("customer") Customer cust, BindingResult br) {
		System.out.println(br);
		if(br.hasErrors())
			return "readcustomer";
		else
			return "writecustomer";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		
		wdb.registerCustomEditor(String.class, ste);
	}
}
