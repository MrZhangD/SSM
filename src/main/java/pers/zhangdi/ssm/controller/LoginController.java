package pers.zhangdi.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.zhangdi.ssm.service.impl.UserServiceImpl;
import pers.zhangdi.ssm.vo.User;

@Controller
public class LoginController {
	@Autowired
	private UserServiceImpl usl;
	
	@RequestMapping("/login.do")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/success.do")
	public String success(Model model,HttpSession session) {
		model.addAttribute("name",(String)session.getAttribute("user"));
		return "success";
	}
	
	@RequestMapping("/check.do")
	public String doLogin(User user , Model model,HttpSession session) {
		if(usl.doUserLogin(user)) {
			model.addAttribute("success","傻吊玩意儿！当你走了");
			model.addAttribute("name", user.getUsername());
			session.setAttribute("user", user.getUsername());
			return "success";
		}else {
			model.addAttribute("fail","就是你错了！兄弟！");
			return "login";
		}
	}
}
