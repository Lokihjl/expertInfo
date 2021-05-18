package cn.edi.expertInfo.domain.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class RewardResDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private Integer expertId;
    
    private String program ;
    
    private String type ;
    
    private String grade ;
    
    private String ranking ;

    private Date year;
    
    private String remark ;

	
}