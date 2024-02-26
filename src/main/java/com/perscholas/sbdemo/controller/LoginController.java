package com.perscholas.sbdemo.controller;

import com.perscholas.sbdemo.model.Person;
import com.perscholas.sbdemo.model.PersonLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
public PersonLogin loginCred(){
    return new PersonLogin();
}
    @GetMapping("/login")
    public String userLogin(Model model){
        model.addAttribute("userLogin", loginCred());
        return "logindemo";
    }
    @PostMapping("/loginResult")
    public String loginResult(Model model, @ModelAttribute PersonLogin login){
        model.addAttribute("logincredentials", login);

        return "login_result";
    }
}
