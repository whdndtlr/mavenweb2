package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login/")
public class LoginController {

	@RequestMapping("/login")  //클래스의 맵핑+함수의 맵핑이 합쳐서 저리
	public String loginform() {
		return "/login/login"; 
	}
	
	@RequestMapping("logindo") // /login/logindo
	public ModelAndView loginform(HttpServletRequest request) {
		System.out.println(request.getRequestURI());
		String[] arr=request.getRequestURI().split("/"); // '/'기준으로 문자열 분리
		String map="/"+arr[1]+"/";  // arr[1]=login
		String page="loin_sucess";  
		ModelAndView mv=new ModelAndView();
		
		request.getSession().setAttribute("id", "user");
		mv.setViewName(map+page); // login+login_sucess
		return mv;
	}
}
