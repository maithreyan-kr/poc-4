package com.mighty.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mighty.model.Admin;
import com.mighty.model.AdminLogin;
import com.mighty.service.*;

@Controller
public class AdminLoginController {

  @Autowired
  AdminService adminService;

  @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
  public ModelAndView showAdminLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("adminlogin");
    mav.addObject("adminlogin", new AdminLogin());

    return mav;
  }

  @RequestMapping(value = "/adminloginProcess", method = RequestMethod.POST)
  public ModelAndView adminloginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("adminlogin") AdminLogin adminlogin) {
    ModelAndView mav = null;

    Admin admin = adminService.validateAdmin(adminlogin);

    if (null != admin) {
      mav = new ModelAndView("welcomeadmin");
      mav.addObject("username", admin.getUsername());
      
    } else {
      mav = new ModelAndView("adminlogin");
      mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }

}
