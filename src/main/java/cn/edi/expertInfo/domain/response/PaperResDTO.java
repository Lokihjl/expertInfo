package cn.edi.expertInfo.domain.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class PaperResDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private Integer expertId;
    
    private String name ;
    
    private String type ;
    
    private String publication ;
    
    private Date paperTime;
    
    private String volume ;

    private String startPage;
    
    private String endPage;
    
    private String writeTime;
    
    private String adress ;
    
    private String total ;
    
    private String ranking ;
    
    private String remark ;

}