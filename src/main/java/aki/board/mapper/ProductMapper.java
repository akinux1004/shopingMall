package aki.board.mapper;

import java.util.List;

import aki.board.domain.ProductVO;

public interface ProductMapper {
	
	public List<ProductVO> selectList(Long bno);
	
	public void insert(ProductVO vo);
}
