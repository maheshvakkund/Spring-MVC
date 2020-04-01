package com.mahesh.springmvcform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mahesh
 *
 */
@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
