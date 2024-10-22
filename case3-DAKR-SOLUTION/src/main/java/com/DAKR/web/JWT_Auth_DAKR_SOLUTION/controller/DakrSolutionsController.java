package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Service.FormsServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("name")
public class DakrSolutionsController {

	@Autowired
	private FormsServiceImpl formsServiceImpl;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String viewLandingPage(Model model) {
//        model.addAttribute("FormData", new FormData());
		return "welcome";
	}

	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String viewInputPage() {
		return "input_form";
	}
	@RequestMapping(value = "/admincontrol", method = RequestMethod.GET)
	public String viewAdminPage() {
		return "admin-dashboard";
	}

	@RequestMapping(value = "/enterpriseForm", method = RequestMethod.GET)
	public String viewEnterprisePage() {
		return "OwnEnterprisesForm";
	}

	@GetMapping("/logout")
	public String handelLogout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		return "input_form";
	}
}
