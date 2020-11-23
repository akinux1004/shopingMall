package aki.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aki.board.domain.BoardVO;
import aki.board.service.BoardService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService bService;
	
	@GetMapping("/list")
	public void boardListPage(Model model){
		
		List<BoardVO> list = bService.selectAll();
		log.info(list);
		
		model.addAttribute("list", list);
		
	} 
	
}
