package aki.board.mapper;

import java.util.List;

import aki.board.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> selectAll();
	
	public void insert(BoardVO vo);
}
