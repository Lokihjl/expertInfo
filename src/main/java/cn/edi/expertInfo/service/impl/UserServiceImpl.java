package cn.edi.expertInfo.service.impl;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import cn.edi.expertInfo.dao.dao.UserMapper;
import cn.edi.expertInfo.domain.User;
import cn.edi.expertInfo.domain.response.IndexHeaderResDTO;
import cn.edi.expertInfo.service.UserService;
import cn.edi.expertInfo.util.DateFormate;
import cn.edi.expertInfo.util.MD5Util;

@Service
public class UserServiceImpl implements UserService {

  @Resource
  UserMapper userMapper;

  @Override
  public String repeatName(String name) {
    int num = userMapper.repeatName(name);
    String flag = (num > 0) ? "1" : "0";
    System.out.println("============");
    System.out.println(flag);
    System.out.println("=====================");
    return flag;
  }

  @Override
  public void insertUser(User user) {
    user.setPassword(MD5Util.crypt(user.getPassword()));
    user.setCreatedate(DateFormate.dateToString(new Date()));
    userMapper.insert(user);
  }

  @Override
  public IndexHeaderResDTO countHeader() {
    return userMapper.countHeader();
  }
}
