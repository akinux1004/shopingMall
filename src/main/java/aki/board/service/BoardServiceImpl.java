package aki.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aki.board.domain.BoardVO;
import aki.board.mapper.BoardMapper;
import aki.board.mapper.ProductMapper;
import lombok.Setter;

@Service

public class BoardServiceImpl implements BoardService {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper bMapper;
	
	@Setter(onMethod_ = @Autowired)
	private ProductMapper pMapper;
	
	
	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub
		List<BoardVO> list = bMapper.selectAll();
		
		return list;
	}
	
	
	@Override
	public void insert(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

}
