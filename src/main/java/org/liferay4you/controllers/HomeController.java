package org.liferay4you.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.liferay4you.utils.Constants;
import org.liferay4you.utils.Mappings;
import org.liferay4you.utils.SpringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = Mappings.HOME)  
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		
		return SpringUtils.createMv(Constants.JSP_HOME, "text", new String("TESTTtTing!!!"));
	}
	
	
}
