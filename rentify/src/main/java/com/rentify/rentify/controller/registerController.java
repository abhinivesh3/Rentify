package com.rentify.rentify.controller;

import com.rentify.rentify.dto.RegisterDto;
import com.rentify.rentify.model.Register;
import com.rentify.rentify.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class registerController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Register());
        return "register";
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    @PostMapping("/register")
    public String registerUserAccount(@ModelAttribute("user")RegisterDto registerDto){
        registerService.save(registerDto);
        return "redirect/:login";
    }
}
