package cn.edi.expertInfo.service;

import java.util.Map;

import cn.edi.expertInfo.domain.User;
import cn.edi.expertInfo.domain.response.IndexHeaderResDTO;

public interface UserService {

  String repeatName(String name);

  void insertUser(User user);

  IndexHeaderResDTO countHeader();

}
