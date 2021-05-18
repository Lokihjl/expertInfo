package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.CategoryMapper;
import cn.edi.expertInfo.domain.Category;
import cn.edi.expertInfo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	CategoryMapper categoryMapper;


	@Override
	public PageInfo getCategorys(int pageNum, int pageSize, String content) {
		return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> categoryMapper.getCategorys(content));
	}

	@Override
	public void insert(Category category) {
		categoryMapper.insert(category) ;
	}

	@Override
	public void update(Category category) {
		categoryMapper.updateByPrimaryKey(category) ;
	}

	@Override
	public Category getCategory(Integer id) {
		return categoryMapper.selectByPrimaryKey(id) ;
	}

	@Override
	public int del(Integer id) {
		return categoryMapper.deleteByPrimaryKey(id) ;
		
	}

}
