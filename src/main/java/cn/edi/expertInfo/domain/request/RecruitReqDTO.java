package cn.edi.expertInfo.domain.request;

import lombok.Data;

@Data
public class RecruitReqDTO {

  private Integer pageNum;

  private Integer pageSize;

  private String content;

}
