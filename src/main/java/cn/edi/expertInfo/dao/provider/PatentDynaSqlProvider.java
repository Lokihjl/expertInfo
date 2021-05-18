package cn.edi.expertInfo.dao.provider;


import static cn.edi.expertInfo.util.Constants.PATENTABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Patent;

public class PatentDynaSqlProvider {
	// 动态插入
			public String insertPatent(Patent patent){
				
				return new SQL(){
					{
						INSERT_INTO(PATENTABLE);
						if(patent.getName() != null && !patent.getName().equals("")){
							VALUES("name", "#{name}");
						}
						if(patent.getRemark() != null && !patent.getRemark().equals("")){
							VALUES("remark", "#{remark}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String updatePatent(Patent patent){
				
				return new SQL(){
					{
						UPDATE(PATENTABLE);
						if(patent.getName() != null){
							SET(" name = #{name} ");
						}
						if(patent.getRemark() != null){
							SET(" remark = #{remark} ");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
