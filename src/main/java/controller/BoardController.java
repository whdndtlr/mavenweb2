package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import board.dao.BoardDAO;
import board.model.BoardVO;
import board.model.PageBoard;

@Controller
public class BoardController {
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("/board/list")
	public ModelAndView list() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageboard", dao.list(1));
		mv.setViewName("/board/list");
		return mv;
	}
	
	@RequestMapping("/board/testform")
	public String testform() {
		return "/board/testform";
	}
	
	@RequestMapping("/board/test") // 한글 깨짐시 produces="application/json; charset=utf8" 코드 추가 
	@ResponseBody //test.jsp body안으로 전송
	public String test(String p) {
		System.out.println("p:"+p);
		return p;
	}
	
	@RequestMapping("/board/searchList")
	public ModelAndView searchList(String field, String search, int requestPage) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageboard", dao.searchList(field, search, requestPage));
		mv.setViewName("/board/list");
		return mv;
	}
}
