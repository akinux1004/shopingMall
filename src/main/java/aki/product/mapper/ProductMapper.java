package aki.product.mapper;

import java.util.List;

import aki.product.domain.ProductVO;

public interface ProductMapper {
	
	public void insert(ProductVO vo);
	
	public List<ProductVO> selectAll();
	
}
