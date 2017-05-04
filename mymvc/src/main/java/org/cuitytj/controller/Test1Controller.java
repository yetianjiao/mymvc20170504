package org.cuitytj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.cuitytj.interfaces.Test1Interface;
import org.cuitytj.interfaces.Test1InterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/** 
* @author 作者 yetianjiao 
* @version 2017年4月7日 上午11:17:57 
* 使用注解的方式开发
*/
@Controller
@RequestMapping("/test")
public class Test1Controller {
	
	@Autowired
	private Test1Interface test1Interface;
	
	@RequestMapping("/one")
 	public ModelAndView testone(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("now",test1Interface.getCurrentTime());
		mv.setViewName("NewFile");
		return mv;
	}
	
	@RequestMapping("/bootstrap")
 	public ModelAndView testbootstrap(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("now",test1Interface.getCurrentTime());
		mv.setViewName("testbootstrap");
		return mv;
	}
	
}
