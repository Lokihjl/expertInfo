package cn.edi.expertInfo.service;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Notice;
import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.domain.User;

public interface PatentService {

  /**
   * 部门信息的service
   */
  PageInfo findAllDept(String content, int pageNum, int pageSize);

  void addDept(Patent dept);

  Patent get_Info(Integer id);

  void update_Info(Patent dept);

  void delete_Info(Integer id);

  PageInfo findAllDept(int pageNum, int pageSize);



  /**
   * 员工信息的service
   */
  List<Patent> get_EmployeeList();

  List<Patent> get_EmployeeLikeList(String content);

  Patent get_EmployeeInfo(Integer id);

  void update_EmployeeInfo(Patent data);

  void insert_EmployeeInfo(Patent data);

  void delete_EmployeeInfo(Integer id);

  List<Notice> get_NoticeList();

  List<Notice> get_NoticeLikeList(String content);

  Notice get_NoticeInfo(Integer id);

  void update_NoticeInfo(Notice notice);

  void insert_NoticeInfo(Notice notice);

  void delete_NoticeInfo(Integer id);

  List<Patent> get_DocumentList();

  List<Patent> get_DocumentLikeList(String content);

  Patent get_DocumentInfo(Integer id);

  void update_DocumentInfo(Patent notice);

  void insert_DocumentInfo(Patent notice);

  void delete_DocumentInfo(Integer id);

  User login(String loginname, String password);

  Map<String, Object> get_UserList(int pageNum, int pageSize);

  Map<String, Object> get_UserLikeList(String content, int pageNum, int pageSize);

  User get_UserInfo(Integer id);

  void update_UserInfo(User notice);

  void insert_UserInfo(User notice);

  void delete_UserInfo(Integer id);

}
