package com.mahesh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mahesh
 *
 */
@Controller
public class MainController {

	/* This mapping redirects us to our index page */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
