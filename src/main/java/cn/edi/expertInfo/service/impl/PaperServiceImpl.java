package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.PaperMapper;
import cn.edi.expertInfo.domain.Paper;
import cn.edi.expertInfo.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {

	@Resource
	PaperMapper paperMapper;

	@Override
	public void insert(Paper paper) {
		paperMapper.insert(paper);
	}

	@Override
	public void update(Paper paper) {
		paperMapper.update_Info(paper);
	}

	@Override
	public PageInfo findAll(String content, int pageNum, int pageSize) {
		return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> paperMapper.get_LikeList(content));
	}

	@Override
	public Paper getPager(Integer id) {
		return paperMapper.get_Info(id);
	}

	@Override
	public int delete(Integer id) {
		return paperMapper.deleteByPrimaryKey(id) ;
	}

}
