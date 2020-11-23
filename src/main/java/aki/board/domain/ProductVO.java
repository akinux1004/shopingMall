package aki.board.domain;

import lombok.Data;

@Data
public class ProductVO {
	
	private Long bno;
	
	private Long pno;
	
	private String p_name;
	private String p_image;
	
	private int p_size;
	private int p_price;
	private int p_amount;
	private String p_color;
	
	private boolean gender;
	private String p_type;
	private String p_wheather;
	
	private String p_company;
	private String p_create_date;
	
	
}
