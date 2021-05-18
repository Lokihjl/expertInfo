package cn.edi.expertInfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.NoticeMapper;
import cn.edi.expertInfo.dao.dao.PatentMapper;
import cn.edi.expertInfo.dao.dao.UserMapper;
import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.domain.User;
import cn.edi.expertInfo.service.PatentService;
import cn.edi.expertInfo.util.MD5Util;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("RainService")
public class PatentServiceImpl implements PatentService {

	@Resource
	PatentMapper patentMapper;
	@Resource
	NoticeMapper noticeMapper;
	@Resource
	UserMapper userMapper;

	@Override
	public User login(String loginname, String password) {
		User user = userMapper.get_login(loginname, MD5Util.crypt(password));
		return user;
	}

	@Override
	public Map<String, Object> get_UserList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<>();
		List<User> list = userMapper.get_List();
		map.put("size", list.size());
		map.put("list", list);
		return map;
	}

	@Override
	public Map<String, Object> get_UserLikeList(String content, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userMapper.get_LikeList(content);
		Map<String, Object> map = new HashMap<>();
		map.put("size", list.size());
		map.put("list", list);
		return map;
	}

	@Override
	public User get_UserInfo(Integer id) {
		return userMapper.get_Info(id);
	}

	@Override
	public void update_UserInfo(User notice) {

		userMapper.update_Info(notice);
	}

	@Override
	public void insert_UserInfo(User notice) {

		// Date date = new Date();
		// String year = String.format("%tY", date);
		// String month = String.format("%tB", date);
		// String day = String.format("%te", date);
		// notice.setCreate_date(year+month+day);
		notice.setLevel("123");
		userMapper.insert(notice);
		// userMapper.insert_Info(notice);
	}

	@Override
	public void delete_UserInfo(Integer id) {

		userMapper.delete_Info(id);
	}

	@Override
	public void insert(Patent patent) {
		patentMapper.insert(patent) ;
	}

	@Override
	public void update(Patent patent) {
		patentMapper.update_Info(patent);
	}

	@Override
	public PageInfo findAll(String content, int pageNum, int pageSize) {
		return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> patentMapper.get_LikeList(content));
	}

	@Override
	public Patent getPatent(Integer id) {
		return patentMapper.get_Info(id);
	}

	@Override
	public int delete(Integer id) {
		return patentMapper.deleteByPrimaryKey(id);
	}

}
