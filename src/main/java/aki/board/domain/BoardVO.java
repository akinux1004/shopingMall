package aki.board.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	
	private Long bno;
	private String title;
	private String writer;
		
	private Date reg_date;
	private Date update_date;
	
	private List<ProductVO> productList;

	
}
