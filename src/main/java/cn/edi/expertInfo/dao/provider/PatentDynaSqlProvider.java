package cn.edi.expertInfo.dao.provider;


import static cn.edi.expertInfo.util.Constants.JOBTABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Patent;

public class PatentDynaSqlProvider {
	// 动态插入
			public String insertDept(Patent job){
				
				return new SQL(){
					{
						INSERT_INTO(JOBTABLE);
						if(job.getName() != null && !job.getName().equals("")){
							VALUES("name", "#{name}");
						}
						if(job.getRemark() != null && !job.getRemark().equals("")){
							VALUES("remark", "#{remark}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String updateDept(Patent job){
				
				return new SQL(){
					{
						UPDATE(JOBTABLE);
						if(job.getName() != null){
							SET(" name = #{name} ");
						}
						if(job.getRemark() != null){
							SET(" remark = #{remark} ");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
