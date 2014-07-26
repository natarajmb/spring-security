/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for all the pages on site
 *
 * @author nataraj.basappa
 * @version 1.0, 20/07/2014
 */
@Controller
public class PageController {

    @RequestMapping(value = "/home.do")
    public String getHomePage(Model model) {
        System.out.println("home");
        return "home";
    }

    @RequestMapping(value = "/login.do")
    public String getLoginPage(Model model) {
        System.out.println("login");
        return "login";
    }

    @RequestMapping(value = "/secure/authenticated.do")
    public String getSecurePage(Model model) {
        System.out.println("authenticated");
        return "authenticated";
    }

    @RequestMapping(value = "/secure/admin/admin.do")
    public String getAdminPage(Model model) {
        System.out.println("admin");
        return "admin";
    }
}
