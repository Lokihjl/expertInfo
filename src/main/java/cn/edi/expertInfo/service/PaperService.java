package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Paper;

public interface PaperService {

  void insert(Paper job);

  void update(Paper job);

  PageInfo findAll(String content, int pageNum, int pageSize);

}
