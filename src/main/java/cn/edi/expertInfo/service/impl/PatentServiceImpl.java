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

import cn.edi.expertInfo.dao.dao.ExperienceMapper;
import cn.edi.expertInfo.dao.dao.ExpertMapper;
import cn.edi.expertInfo.dao.dao.NoticeMapper;
import cn.edi.expertInfo.dao.dao.PaperMapper;
import cn.edi.expertInfo.dao.dao.PatentMapper;
import cn.edi.expertInfo.dao.dao.UserMapper;
import cn.edi.expertInfo.domain.Notice;
import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.domain.User;
import cn.edi.expertInfo.service.PatentService;
import cn.edi.expertInfo.util.MD5Util;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("RainService")
public class PatentServiceImpl implements PatentService {

	@Resource
	ExperienceMapper deptMapper;
	@Resource
	ExpertMapper documentMapper;
	@Resource
	PaperMapper employeeMapper;
	@Resource
	PatentMapper jobMapper;
	@Resource
	NoticeMapper noticeMapper;
	@Resource
	UserMapper userMapper;

	@Override
	public void delete_Info(Integer id) {

		deptMapper.delete_Info(id);
	}

	@Override
	public void delete_EmployeeInfo(Integer id) {
		employeeMapper.delete_Info(id);
	}

	/**
	 * 公告管理
	 */
	@Override
	public List<Notice> get_NoticeList() {

		return noticeMapper.get_List();
	}

	@Override
	public List<Notice> get_NoticeLikeList(String content) {

		return noticeMapper.get_LikeList(content);
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
	public void insert_NoticeInfo(Notice notice) {

		// Date date = new Date();
		// String year = String.format("%tY", date);
		// String month = String.format("%tB", date);
		// String day = String.format("%te", date);
		// notice.setCreate_date(year+month+day);
		noticeMapper.insert_Info(notice);
	}

	@Override
	public void delete_NoticeInfo(Integer id) {

		noticeMapper.delete_Info(id);
	}

	@Override
	public void delete_DocumentInfo(Integer id) {

		documentMapper.delete_Info(id);
	}

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
	public PageInfo findAllDept(String content, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDept(Patent dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public Patent get_Info(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update_Info(Patent dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public PageInfo findAllDept(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patent> get_EmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patent> get_EmployeeLikeList(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patent get_EmployeeInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update_EmployeeInfo(Patent data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert_EmployeeInfo(Patent data) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Patent> get_DocumentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patent> get_DocumentLikeList(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patent get_DocumentInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update_DocumentInfo(Patent notice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert_DocumentInfo(Patent notice) {
		// TODO Auto-generated method stub

	}
}
