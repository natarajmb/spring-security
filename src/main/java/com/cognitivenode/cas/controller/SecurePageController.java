package com.cognitivenode.cas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurePageController {

    @RequestMapping(value = "/securepage.do")
    public String getSecurePage(Model model) {
        System.out.println("Securepage");
        return "securepage";
    }
}
