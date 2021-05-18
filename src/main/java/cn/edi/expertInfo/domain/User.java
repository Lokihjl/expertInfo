package cn.edi.expertInfo.domain;

import javax.persistence.*;
import lombok.Data;

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "expert_id")
    private Integer expertId;

    private String loginname;

    private String password;

    /**
     * 级别
     */
    private String level;

    private String createdate;

    private String username;
}