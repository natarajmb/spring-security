/*
 * Copyright (c) Cognitivenode 2014. All Rights Reserved.
 *
 * No part of this source code or any of its contents may be reproduced, copied,
 * modified or adapted, without the prior written consent of the author,
 * unless otherwise indicated for stand-alone materials.
 */

package com.cognitivenode.cas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the homepage
 *
 * @author nataraj.basappa
 * @version 1.0, 20/07/2014
 */
@Controller
public class HomePageController {

    @RequestMapping(value = "/homepage.do")
    public String getHomePage(Model model) {
        System.out.println("Homepage");
        return "homepage";
    }
}
