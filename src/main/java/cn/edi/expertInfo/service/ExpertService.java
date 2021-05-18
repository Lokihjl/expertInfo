package cn.edi.expertInfo.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Expert;

public interface ExpertService {

  Map<String,Object> getInfo();

  PageInfo getEmployee(int pageNum, int pageSize);

  void insert(Expert employee);

  void update(Expert employee);

  PageInfo getEmployee(String content, int pageNum, int pageSize);

  Expert getEmployee(Integer id);

}
