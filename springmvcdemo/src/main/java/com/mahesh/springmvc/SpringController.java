package com.mahesh.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mahesh
 *
 */
@Controller
@RequestMapping("/springController")
public class SpringController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// New controller method to read form data and add data to the model
	/*
	 * In this case we take the complete form data and filter the student name which
	 * we need to process
	 */
	@RequestMapping("/processFormVersionTwo")
	public String displayNameInUpperCase(HttpServletRequest request, Model model) {
		model.addAttribute("message", "YO!!!!" + request.getParameter("studentName").toUpperCase());
		return "helloworld";
	}

	/*
	 * In this case we take the only the student name which we need to process
	 */
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		model.addAttribute("message", "YO!!!! My Friend " + theName.toUpperCase());
		return "helloworld";
	}

}
