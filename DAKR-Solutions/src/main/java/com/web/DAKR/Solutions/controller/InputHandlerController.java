package com.web.DAKR.Solutions.controller;

import com.web.DAKR.Solutions.dto.FormData;
import com.web.DAKR.Solutions.services.FormDataService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class InputHandlerController {
    @Autowired
    FormDataService formDataService;

    @RequestMapping(value = "/inputForm", method = RequestMethod.GET)
    public String viewLoginPage(Model model) {
        model.addAttribute("FormData", new FormData());
        return "input_form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("formData") FormData formData,Model model) {

    	boolean status=formDataService.registerFormData(formData);
    if (status){
        model.addAttribute("successMsg","User Registered Successfully");
    model.addAttribute("name",formData.getName());
    model.addAttribute("id",formData.getId());
    model.addAttribute("goal",formData.getGoal());
    model.addAttribute("roadmap",formData.getRoadmap());
    return "welcome";
    }
    else {
        model.addAttribute("errorMsg","USER NOT REGISTERED...!");
    }
    return "input_form";
    }

    @GetMapping("/logout")
    public String handelLogout(HttpServletRequest request){
    HttpSession session=request.getSession(false);
    if (session!=null){
        session.invalidate();
    }
    return "input_form";
    }

}

