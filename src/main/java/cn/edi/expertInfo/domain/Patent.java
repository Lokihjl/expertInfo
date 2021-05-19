package cn.edi.expertInfo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Patent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "expert_id")
    private Integer expertId;
    
    private String name ;
    
    private String type ;
    
    private String country ;
    
    private String grant ;

    private String year;
    
    private String remark ;

	
}