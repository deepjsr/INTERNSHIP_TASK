package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models.DAKRSolutionEnterpriseForm;
import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Service.EnterpriseFormImpl;

@Controller
@SessionAttributes("name")
public class EnterpriseFormController {

	@Autowired
	private EnterpriseFormImpl eformsServiceImpl;

	@RequestMapping(value = "/eTform", method = RequestMethod.GET)
	public List<DAKRSolutionEnterpriseForm> getAllForms(Model model) {
		List<DAKRSolutionEnterpriseForm> forms = this.eformsServiceImpl.getAllEnterpriseUsersForms();
		if (forms != null) {
			model.addAttribute("FormData", forms);
			return forms;
		}
		return null;
	}

	@RequestMapping(value = "/eTForm/{id}", method = RequestMethod.GET)
	public DAKRSolutionEnterpriseForm getAllFormsById(@PathVariable int id, Model model) {
		DAKRSolutionEnterpriseForm forms = this.eformsServiceImpl.getEnterpriseUsersFormsById(id);
		if (forms != null) {
			model.addAttribute("FormData", forms);
			return forms;
		}
		return null;
	}

	@PostMapping("/eTForm")
	public String submitEForString(@ModelAttribute("formData") DAKRSolutionEnterpriseForm eform, Model model) {
		boolean status = eformsServiceImpl.saveEnterpriseForms(eform);
		if (status) {
			model.addAttribute("successMsg", "Data Saved Successfully");
			model.addAttribute("name", eform);
			return "my-data";
		} else {
			model.addAttribute("errorMsg", "ERROR SAVING DATA...!");
		}
		return "input_form";
	}

	@DeleteMapping("/eTForm/{id}")
	public DAKRSolutionEnterpriseForm deleteEtForm(@PathVariable int id) {
		return eformsServiceImpl.deleteForm(id);
	}

}
