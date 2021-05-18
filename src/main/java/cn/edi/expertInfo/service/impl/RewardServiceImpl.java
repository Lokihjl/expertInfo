package cn.edi.expertInfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.dao.dao.RewardMapper;
import cn.edi.expertInfo.domain.Reward;
import cn.edi.expertInfo.domain.response.RewardResDTO;
import cn.edi.expertInfo.service.RewardService;

@Service
public class RewardServiceImpl implements RewardService {

	@Resource
	RewardMapper rewardMapper;

	@Override
	public void insertOne(Reward reward) {
		rewardMapper.insert(reward);
	}

	@Override
	public PageInfo getReward(int pageNum, int pageSize, String content) {
		return PageHelper.startPage(pageNum, pageSize, true).doSelectPageInfo(() -> rewardMapper.getReward(content));
	}

	@Override
	public void delete(Integer id) {
		rewardMapper.deleteByPrimaryKey(id);
	}

	@Override
	public RewardResDTO getReward(int id) {
		return rewardMapper.getRewardById(id);
	}
}
