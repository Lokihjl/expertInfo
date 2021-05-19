package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.ExpertMapper;
import cn.edi.expertInfo.domain.Expert;
import cn.edi.expertInfo.service.ExpertService;

@Service
public class ExpertServiceImpl implements ExpertService {

	@Resource
	ExpertMapper expertMapper;

	@Override
	public PageInfo getExpert(String content, int pageNum, int pageSize) {
		PageInfo pageInfo = null;
		if (content == null) {
			pageInfo = PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> expertMapper.get_List());
		} else {
			pageInfo = PageHelper.startPage(pageNum, pageSize, true)
					.doSelectPageInfo(() -> expertMapper.get_LikeList(content));
		}
		return pageInfo;
	}

	@Override
	public void insert(Expert expert) {
		expertMapper.insert(expert);
	}

	@Override
	public void update(Expert expert) {
		expertMapper.update_Info(expert);
	}

	@Override
	public Expert getExpert(Integer id) {
		return expertMapper.get_Info(id);
	}

	@Override
	public int delete(Integer id) {
		return expertMapper.deleteByPrimaryKey(id);
	}
	
}
