package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Paper;

public interface PaperService {

  void insert(Paper paper);

  void update(Paper paper);

  PageInfo findAll(String content, int pageNum, int pageSize);
  
  Paper getPager(Integer id);
  
  int delete(Integer id);

}
