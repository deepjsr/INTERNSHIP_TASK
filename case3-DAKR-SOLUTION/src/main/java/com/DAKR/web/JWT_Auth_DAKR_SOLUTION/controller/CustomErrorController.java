package com.DAKR.web.JWT_Auth_DAKR_SOLUTION.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "error-page"; // returns error.html or error.jsp
    }


}
