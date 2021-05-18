package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Notice;

public interface NoticeService {

  PageInfo getNotice(int pageNum, int pageSize, String content);

  void insertNotice(Notice notice);
  
  Notice get_NoticeInfo(Integer id);

  void update_NoticeInfo(Notice notice);

  void delete_NoticeInfo(Integer id);
}
