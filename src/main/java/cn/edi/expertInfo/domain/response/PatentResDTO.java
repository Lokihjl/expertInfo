package cn.edi.expertInfo.domain.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class PatentResDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private Integer expertId;
    
    private String name ;
    
    private String type ;
    
    private String country ;
    
    private String grant ;

    private Date year;
    
    private String remark ;

	
}