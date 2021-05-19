package cn.edi.expertInfo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Expert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "user_id")
    private Integer userId ;

    private String name;

    private String sex;
    
    private String birthday ;
    
    @Column(name = "category_id")
    private Integer categoryId ;
    
    @Column(name = "category_name")
    private String categoryName ;
    
    @Column(name = "card_number")
    private String cardNumber ;
    
    @Column(name = "work_code")
    private String workCode ;
    
    @Column(name = "professional_discipline")
    private String professionalDiscipline ;
    
    @Column(name = "final_education")
    private String finalEducation ;
    
    @Column(name = "highest_degree")
    private String highestDegree ;
    
    @Column(name = "postal_address")
    private String postalAddress ;
    
    @Column(name = "postal_code")
    private String postalCode ;
    
    private String tel ;
    
    private String nation ;
    
    private String political ;
    
    private String remark ;

	
}