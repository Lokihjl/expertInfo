package cn.edi.expertInfo.dao.provider;

import static cn.edi.expertInfo.util.Constants.DEPTTABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Reward;

public class RewardDynaSqlProvider {
	
//	// 动态插入
//		public String insertDept(Reward dept){
//			
//			return new SQL(){
//				{
//					INSERT_INTO(DEPTTABLE);
//					if(dept.getName() != null && !dept.getName().equals("")){
//						VALUES("name", "#{name}");
//					}
//					if(dept.getRemark() != null && !dept.getRemark().equals("")){
//						VALUES("remark", "#{remark}");
//					}
//				}
//			}.toString();
//		}	
//		// 动态更新
//		public String updateDept(Reward dept){
//			
//			return new SQL(){
//				{
//					UPDATE(DEPTTABLE);
//					if(dept.getName() != null){
//						SET(" name = #{name} ");
//					}
//					if(dept.getRemark() != null){
//						SET(" remark = #{remark} ");
//					}
//					WHERE(" id = #{id} ");
//				}
//			}.toString();
//		}
}
