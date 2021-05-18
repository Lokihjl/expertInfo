package cn.edi.expertInfo.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.ExperienceMapper;
import cn.edi.expertInfo.dao.dao.PaperMapper;
import cn.edi.expertInfo.dao.dao.PatentMapper;
import cn.edi.expertInfo.domain.Expert;
import cn.edi.expertInfo.service.ExpertService;

@Service
public class ExpertServiceImpl implements ExpertService {

	@Resource
	PatentMapper jobMapper;

	@Resource
	ExperienceMapper experienceMapper;

	@Resource
	PaperMapper employeeMapper;

	@Override
	public Map<String, Object> getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo getEmployee(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Expert employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Expert employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public PageInfo getEmployee(String content, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expert getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
