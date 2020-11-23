package aki.board.service;

import java.util.List;

import aki.board.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> selectAll();
	
	public void insert(BoardVO vo);
	
}
