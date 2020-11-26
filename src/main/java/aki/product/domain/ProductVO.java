package aki.product.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ProductVO {
	
	private Long pno;
	private String brand;
	private String title;
	private String content;  // 나중에 콘텐트가 더 필요 할수 있을때 추가 하자 content 1 , content2 이런식으로
	
	private int price;
	
	private Date reg_date;
	private Date update_date;
	
	private String thumbnail; // 메인 페이지의 이미지
	
	private List<ProductAttachVO> attachList;
	
	private ProductDetailVO detail; // 나중에 제품 상세 내용 필요할때 대비
	
}
