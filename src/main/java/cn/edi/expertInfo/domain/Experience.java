package cn.edi.expertInfo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "expert_id")
    private Integer expertId; 

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;
    
    private String work ;
    
    private String education ;
    
    private String degree ;
    
    private String position ;
    
    private String title ;
    
    private String remark ;

}