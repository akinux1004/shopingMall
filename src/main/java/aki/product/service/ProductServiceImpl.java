package aki.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aki.product.domain.ProductVO;
import aki.product.mapper.ProductMapper;
import lombok.Setter;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Setter(onMethod_ = @Autowired)
	private ProductMapper pMapper;
	
	@Override
	public List<ProductVO> selectAll() {
		// TODO Auto-generated method stub
		List<ProductVO> list= pMapper.selectAll();
		return list;
	}

	@Override
	public void register(ProductVO vo) {
		// TODO Auto-generated method stub
		
		pMapper.insert(vo);
		
	}



	
	
}
