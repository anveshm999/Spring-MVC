package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SillyController {
	
	//need controller to show initial html form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need controller to process html form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld-processed";
	}
	
	
	//new controller method to read from  data and add data to model
	@RequestMapping("/processFormVersion2")
	public String shoutDude(HttpServletRequest request, Model model){
		//read the request parameter from html form
		String theName = request.getParameter("studentName");
		
		//convert data to uppercase
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo !" +theName;
		
		// add message to model
		model.addAttribute("message",result); // here message is the name and result is the value
		
		
		return "helloworld-processed"; // Page to be displayed helloWorld.jsp
	}
	
	//new controller method to read from  requestparam directly
		@RequestMapping("/processFormVersion3")
		public String processFormVersion3(@RequestParam("studentName") String theName
				, Model model){
			//read the request parameter from html form
			//String theName = request.getParameter("studentName"); -- THIS IS NOT REQUIRED AS WE ALREADY SET IT IN REQUESTPARAM ABOVE
			
			//convert data to uppercase
			theName = theName.toUpperCase();
			
			//create message
			String result = "Hey Martin's friend " +theName;
			
			// add message to model
			model.addAttribute("message",result); // here message is the name and result is the value
			
			
			return "helloworld-processed"; // Page to be displayed helloWorld.jsp
		}
	
}
