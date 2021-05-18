package cn.edi.expertInfo.domain.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ExperienceResDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private Integer expertId; 

    private Date startDate;

    private Date endDate;
    
    private String work ;
    
    private String education ;
    
    private String degree ;
    
    private String position ;
    
    private String title ;
    
    private String remark ;

}