package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.domain.response.RewardResDTO;

public interface RewardService {

  void insertOne(Reward reward);

  PageInfo getReward(int pageNum,int pageSize,String content);

  void delete(Integer id);

  RewardResDTO getReward(int id);
}
