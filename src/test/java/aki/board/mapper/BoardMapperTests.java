package aki.board.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	
	@Test
	public void testMapper() {
		log.info(boardMapper+"    Let`s begin BoardMapperTests!!!");
		
	}
	
	
	@Test
	public void selectAll() {
		
		boardMapper.selectAll();
		
	}
	
//	@Test
//	public void selectAllTest() {
//		boardMapper.selectAll();
//	}
//	
//	@Test
//	public void insertMapper() {
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("날마다 오는게 아니야~");
//		vo.setWriter("약장수");
//		
//		boardMapper.insert(vo);
//	}
	
}
