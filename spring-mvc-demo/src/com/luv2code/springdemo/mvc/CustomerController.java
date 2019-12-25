package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	//add an init binder to convert trim strings, remove leading/trailing whitespace to resolve validations
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		//create a customer object
		Customer customer = new Customer();
		
		//add customer object to the model
		theModel.addAttribute(customer);	
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult){ //will map the customer attribute from jsp and tells spring to validate customer object
										  //spring will store results of validation in BindingResult object (happens at spring backend)
		
		if(bindingResult.hasErrors()){
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
		
	}
	

}
