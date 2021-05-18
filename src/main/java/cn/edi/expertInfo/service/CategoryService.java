package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Category;

public interface CategoryService {

  PageInfo getCategorys(int pageNum, int pageSize, String content);

  void insert(Category category);
  
  void update(Category category) ;
  
  Category getCategory(Integer id) ;
  
  int del(Integer id) ;	
}
