package aki.product.service;

import java.util.List;

import aki.product.domain.ProductVO;

public interface ProductService {
	
	public List<ProductVO> selectAll();
	
	public void register(ProductVO vo);
	
}
