package sshtest.sshtest1.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sshtest.sshtest1.bo.User;
import sshtest.sshtest1.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value="/get",method=RequestMethod.GET)  
    public String Get(HttpServletRequest request,Model model){  
		  int userId = Integer.parseInt(request.getParameter("id"));  
        System.out.println("userId:"+userId);
        User user=userService.get(userId);
        if(user!=null) {
            log.debug(user.toString());
        	}
        model.addAttribute("user", user);  
        return "user/index";  
    }  
}
