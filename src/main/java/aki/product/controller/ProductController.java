package aki.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aki.product.domain.ProductVO;
import aki.product.service.ProductService;
import lombok.Setter;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Setter(onMethod_ = @Autowired)
	private ProductService pService;
	
	@GetMapping("/list")
	public void list(Model model) {
		
		List<ProductVO> list = pService.selectAll();
		
		model.addAttribute("list", list);
		
	}
	
	@GetMapping("/productRegister")
	public void getRegister() {
		
	}
	
	@PostMapping("/productRegister")
	public String postRegister(ProductVO vo) {
		
		pService.register(vo);
		
		return "redirect:/product/list";
	}
	
	
	
}
