/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import web.domain.service.VersionService;

/**
 *
 * @author moritakenji
 */
@Controller
public class MyController {
//    @Autowired
//    private VersionService versionService;
    
    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }

}
