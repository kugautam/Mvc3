package com.gautam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gautam.mvc.User;

@Controller
public class UserController 
{
	@RequestMapping("/views/login")
	public String  authentication(@ModelAttribute("user") User user)
	{
       if((user.passWord).equals("iTransform")&&(user.userName).equals("capgemini"))
    	   return "success";
    	   else
    		   return "error";
       }
	}