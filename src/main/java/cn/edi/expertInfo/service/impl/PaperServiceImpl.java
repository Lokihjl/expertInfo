package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.ExpertMapper;
import cn.edi.expertInfo.domain.Paper;
import cn.edi.expertInfo.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {

	@Resource
	ExpertMapper documentMapper;

	@Override
	public void insert(Paper job) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Paper job) {
		// TODO Auto-generated method stub

	}

	@Override
	public PageInfo findAll(String content, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
