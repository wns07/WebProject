package org.zerock.controller;

import javax.inject.*;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.zerock.domain.*;
import org.zerock.service.*;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		logger.info("register get.............");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(BoardVO board, Model model) throws Exception {
		logger.info("register post.............");
		logger.info(board.toString());
		
		service.regist(board);
		
		model.addAttribute("result", "success");
		
//		return "/board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("show all list......................");
	}
}
