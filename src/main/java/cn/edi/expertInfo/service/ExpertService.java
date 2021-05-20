package cn.edi.expertInfo.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Expert;

public interface ExpertService {

	PageInfo getExpert(String content, int pageNum, int pageSize);
	
	List<Expert> allList() ;

	void insert(Expert expert);

	void update(Expert expert);

	Expert getExpert(Integer id);
	
	int delete(Integer id) ;

}
