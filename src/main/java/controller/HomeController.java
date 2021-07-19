package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Data.Weahter;

@Controller
public class HomeController {
	
	//url -> /aaa -> aaa.jsp파일을 요구하고 있음
	//리턴값이 없는 함수를 맵핑할 경우 위의 사항이 적용됨
	@RequestMapping("/test")
	void test() {
		System.out.println("test");
	}
	
	@RequestMapping("/test1")
	ModelAndView test1() {
		System.out.println("test1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "test1");
		mv.setViewName("test");
		return mv;
	}
	
	@RequestMapping("/test2")
	ModelAndView test2() {
		System.out.println("test2");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "test2");
		mv.setViewName("test");
		return mv;
	}
	
	@RequestMapping("/test3")
	String test3() {
		return "test3";
	}
	
	@RequestMapping("/weather")
	ModelAndView weather(HttpServletRequest request, HttpServletResponse Response) {
		//추가사항
		/*
		ServletContext context=request.getServletContext();
		context.setAttribute("context", "context");
		
		HttpSession session=request.getSession();
		context.setAttribute("session", "session");
		*/
		
		ModelAndView mv = new ModelAndView(); //내부적으로 request, response
		mv.addObject("data", new Weahter().getweatherData());
		mv.setViewName("weather");
		return mv;
	}
	
}
