package aki.product.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aki.product.domain.ProductVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
@Log4j
public class ProductMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private ProductMapper pMapper;
	
//	@Test
//	public void insertTest() {
//		
//		ProductVO vo = new ProductVO();
//		vo.setBrand("Dior");
//		vo.setTitle("신상품 출시");
//		vo.setContent("가나다라마바사아차카타마파하1234567890");
//		vo.setPrice(1000000);
//		vo.setThumbnail("C:\\Dev\\study\\shopping\\baseXML\\src\\main\\webapp\\resources\\img\\test1.jpg");
//		
//		IntStream.rangeClosed(1, 5).forEach(i ->{
//			pMapper.insert(vo);
//		});
//		
//		
//	}
	
	@Test
	public void selectAllTest() {
		
		List<ProductVO> pList = pMapper.selectAll();
		
		pList.forEach(p -> log.info(p));
		
	}
	
}
