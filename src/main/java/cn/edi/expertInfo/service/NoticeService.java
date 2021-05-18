package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Notice;

public interface NoticeService {

  PageInfo getNotice(int pageNum, int pageSize, String content);


  void insertNotice(Notice notice);
}
