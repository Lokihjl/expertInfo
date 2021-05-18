package cn.edi.expertInfo.dao.provider;

import static cn.edi.expertInfo.util.Constants.REWARDTABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Reward;

public class RewardDynaSqlProvider {
	
		// 动态插入
		public String insert(Reward reward){
			
			return new SQL(){
				{
					INSERT_INTO(REWARDTABLE);
					if(reward.getProgram() != null && !reward.getProgram().equals("")){
						VALUES("name", "#{name}");
					}
					if(reward.getRemark() != null && !reward.getRemark().equals("")){
						VALUES("remark", "#{remark}");
					}
				}
			}.toString();
		}	
		// 动态更新
		public String update(Reward reward){
			
			return new SQL(){
				{
					UPDATE(REWARDTABLE);
					if(reward.getProgram() != null){
						SET(" name = #{name} ");
					}
					if(reward.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}
