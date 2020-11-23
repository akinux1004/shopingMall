package aki.board.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aki.board.domain.ProductVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
@Log4j
public class ProductMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private ProductMapper productMapper;
	
	@Test
	public void testMapper() {
		log.info(productMapper+"    Let`s begin ProductMapperTests!!!");
		
	}
	
//	@Test
//	public void selectTest() {
//		List<ProductVO> list =  productMapper.selectList(2L);
//		
//		list.forEach(p -> log.info(p));
//	}
	
	@Test
	public void insertTest() {
		
		IntStream.rangeClosed(1, 2).forEach( i -> {
		
				ProductVO vo = new ProductVO();
				vo.setBno(6L);
				vo.setGender(false);
				vo.setP_amount(100);
				vo.setP_color("black");
				vo.setP_company("kakao");
				vo.setP_create_date("2020-11-21");
				vo.setP_name("최강 신상 입고!!! 마지막 기회");
				vo.setP_price(1000000);
				vo.setP_size(70 + (i*5));
				vo.setP_type("상의");
				vo.setP_wheather("겨울");
				vo.setP_image("thumbnail");
				
				productMapper.insert(vo);
				
				log.info(vo);
			}
		); //end stream
		
	}
	
}
