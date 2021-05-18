package cn.edi.expertInfo.domain.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ExpertResDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private String sex;
    
    private Date birthday ;
    
    private String cardNumber ;
    
    private String workCode ;
    
    private String professional_discipline ;
    
    private String finalEducation ;
    
    private String highestDegree ;
    
    private String postalAddress ;
    
    private String postalCode ;
    
    private String tel ;
    
    private String nation ;
    
    private String political ;
    
    private String remark ;

	
}