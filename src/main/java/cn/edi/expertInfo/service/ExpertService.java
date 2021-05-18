package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Expert;

public interface ExpertService {

	PageInfo getExpert(String content, int pageNum, int pageSize);

	void insert(Expert expert);

	void update(Expert expert);

	Expert getExpert(Integer id);
	
	int delete(Integer id) ;

}
