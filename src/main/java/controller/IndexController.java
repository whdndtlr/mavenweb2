package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("exec");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "1234"); //addobject를 이용해서 data를 저장, jsp에서 사용할 데이터
		mv.setViewName("index"); //setViewName로 경로를 지정(기준:WEB-INF)
		return mv;
		
	}

}
