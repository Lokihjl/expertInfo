package cn.edi.expertInfo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.NoticeMapper;
import cn.edi.expertInfo.domain.Notice;
import cn.edi.expertInfo.service.NoticeService;
import cn.edi.expertInfo.util.DateFormate;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Resource
	NoticeMapper noticeMapper;

	@Override
	public PageInfo getNotice(int pageNum, int pageSize, String content) {
		PageInfo pageInfo = null;
		if (content == null) {
			pageInfo = PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> noticeMapper.get_List());
		} else {
			pageInfo = PageHelper.startPage(pageNum, pageSize, true)
					.doSelectPageInfo(() -> noticeMapper.get_LikeList(content));
		}
		return pageInfo;
	}

	@Override
	@Transactional
	public void insertNotice(Notice notice) {
		notice.setCreateDate(DateFormate.dateToString(new Date()));
		// noticeMapper.insert_Info(notice);
		noticeMapper.insert(notice);
	}

	@Override
	public Notice get_NoticeInfo(Integer id) {
		return noticeMapper.get_Info(id);
	}

	@Override
	public void update_NoticeInfo(Notice notice) {
		noticeMapper.update_Info(notice);

	}

	@Override
	public void delete_NoticeInfo(Integer id) {
		noticeMapper.delete_Info(id);

	}
}
