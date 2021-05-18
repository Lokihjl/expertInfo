package cn.edi.expertInfo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "expert_id")
    private Integer expertId;
    
    private String name ;
    
    private String type ;
    
    private String publication ;
    
    @Column(name = "paper_time")
    private Date paperTime;
    
    private String volume ;

    @Column(name = "start_page")
    private String startPage;
    
    @Column(name = "end_page")
    private String endPage;
    
    @Column(name = "write_time")
    private String writeTime;
    
    private String adress ;
    
    private String total ;
    
    private String ranking ;
    
    private String remark ;

}