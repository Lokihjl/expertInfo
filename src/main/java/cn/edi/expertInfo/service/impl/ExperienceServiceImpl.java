package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.ExperienceMapper;
import cn.edi.expertInfo.domain.Experience;
import cn.edi.expertInfo.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	@Resource
	ExperienceMapper experienceMapper;

	@Override
	public PageInfo getExperience(int pageNum, int pageSize, String content) {
		return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> experienceMapper.getExperiences(content));
	}

	@Override
	public void insert(Experience experience, Integer id) {
		experienceMapper.insert(experience);

	}

}
