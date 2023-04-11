package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LogoutController  {

	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login.jsp";
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("�α׾ƿ� ó��");
//		
//		ModelAndView mav=new ModelAndView();
//		// 1. �������� ����� ���� ��ü�� ���� �����Ѵ�.
//		HttpSession session = request.getSession();
//		session.invalidate();
//		
//		// 2. ���� ������, ���� ȭ������ �̵��Ѵ�.
//		mav.setViewName("redirect:login.jsp");
//		return mav;
//	}

}
