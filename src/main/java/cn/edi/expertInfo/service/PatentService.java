package cn.edi.expertInfo.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.domain.User;

public interface PatentService {

	void insert(Patent patent);

	void update(Patent patent);

	PageInfo findAll(String content, int pageNum, int pageSize);

	Patent getPatent(Integer id);

	int delete(Integer id);
	
	

	User login(String loginname, String password);

	Map<String, Object> get_UserList(int pageNum, int pageSize);

	Map<String, Object> get_UserLikeList(String content, int pageNum, int pageSize);
	
	List<User> userList() ;

	User get_UserInfo(Integer id);

	void update_UserInfo(User notice);

	void insert_UserInfo(User notice);

	void delete_UserInfo(Integer id);

}
