package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class BoardController {
	
	@RequestMapping(value = "/boardList", method=RequestMethod.GET)
	public String boardList() {
		return "/boardList";
	}
	
	@RequestMapping(value = "/boardWrite", method=RequestMethod.GET)
	public String boardWrite() {
		return "/boardWrite";
	}
	
	@RequestMapping(value = "/boardUpdate", method=RequestMethod.GET)
	public ModelAndView boardUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardUpdate");
		return mv;
	}
	
	@RequestMapping(value = "/boardDelete", method=RequestMethod.GET)
	public ModelAndView boardDelete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/boardDelete");
		return mv;
	}
	
	
	
	
}
