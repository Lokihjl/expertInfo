package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.domain.response.RewardResDTO;

public interface RewardService {

  void insert(Reward reward);
  
  void update(Reward reward);

  PageInfo getReward(int pageNum,int pageSize,String content);

  void delete(Integer id);

  Reward getReward(int id);
}
