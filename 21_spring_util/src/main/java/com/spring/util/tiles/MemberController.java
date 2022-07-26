package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class MemberController {
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login() {
		return "/login";
	}
	
	@RequestMapping(value = "/detail", method=RequestMethod.GET)
	public String detail() {
		return "/detail";
	}

	@RequestMapping(value = "/cart", method=RequestMethod.GET)
	public ModelAndView cart() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cart");
		return mv;
	}
	
	@RequestMapping(value = "/myPage", method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("/myPage");
	}
}
