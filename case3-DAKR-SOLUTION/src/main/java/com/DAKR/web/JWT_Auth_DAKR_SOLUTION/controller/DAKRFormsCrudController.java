package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Models.DAKRSolutionForm;
import com.DAKR.web.JWT_Auth_DAKR_SOLUTION.Service.FormsServiceImpl;

@Controller
@SessionAttributes("name")
public class DAKRFormsCrudController {

	@Autowired
	private FormsServiceImpl formsServiceImpl;

	@RequestMapping(value = "/allUser", method = RequestMethod.GET)
	public ResponseEntity<List<DAKRSolutionForm>> getAllForms(Model model) {
		List<DAKRSolutionForm> forms=this.formsServiceImpl.getAllUsersForms();
		if (forms != null) {
			model.addAttribute("FormData", forms);
			
			return ResponseEntity.ok(forms) ;
		}
		return null;
	}
	@RequestMapping(value = "/allUsersForms/{id}", method = RequestMethod.GET)
	public DAKRSolutionForm getAllFormsById(@PathVariable int id,Model model) {
		DAKRSolutionForm forms=this.formsServiceImpl.getUsersFormsById(id);
		if (forms != null) {
			model.addAttribute("FormData", forms);
			return forms ;
		}
		return null;
	}
	

	@PostMapping("/submitDForm")
	public String submitUForm(@ModelAttribute("formData") DAKRSolutionForm usersForm, Model model) {
		boolean status = formsServiceImpl.saveUsersForms(usersForm);
		if (status) {
	        model.addAttribute("successMsg","Data Saved Successfully");
			model.addAttribute("FormData", usersForm);
			return "my-data";	
		} else {
			model.addAttribute("errorMsg", "ERROR SAVING DATA...!");
		}
		return "input_form";
	}

	@DeleteMapping("/submitDForm/{id}")
public ResponseEntity<DAKRSolutionForm> deleteForm(@PathVariable int id) {
		DAKRSolutionForm forms=	formsServiceImpl.deleteForm(id);
	return  ResponseEntity.ok(forms) ;

	}
	
}
