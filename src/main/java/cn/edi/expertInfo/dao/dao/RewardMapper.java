package cn.edi.expertInfo.dao.dao;

import java.util.List;

import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.domain.response.RewardResDTO;
import tk.mybatis.mapper.common.Mapper;

public interface RewardMapper extends Mapper<Reward> {

  List<RewardResDTO> getReward(String content);

  RewardResDTO getRewardById(Integer id);
}
