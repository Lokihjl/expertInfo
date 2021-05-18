package cn.edi.expertInfo.dao.provider;

import cn.edi.expertInfo.domain.Expert;
import static cn.edi.expertInfo.util.Constants.EXPERIENCETABLE;

import org.apache.ibatis.jdbc.SQL;

public class ExpertDynaSqlProvider {
	
	// 动态插入
		public String insert(Expert expert){
			
			return new SQL(){
				{
					INSERT_INTO(EXPERIENCETABLE);
					if(expert.getName() != null ){
						VALUES("name", "#{name}");
					}
					if(expert.getRemark() != null ){
						VALUES("remark", "#{remark}");
					}
					if(expert.getBirthday() != null ){
						VALUES("birthday", "#{birthday}");
					}
					if(expert.getCategoryId() != null ){
						VALUES("category_id", "#{category_id}");
					}
					if(expert.getCardNumber() != null ){
						VALUES("Card_number", "#{Card_number}");
					}
				}
			}.toString();
		}	
		// 动态更新
		public String update(Expert expert){
			
			return new SQL(){
				{
					UPDATE(EXPERIENCETABLE);
					if(expert.getName() != null){
						SET(" name = #{name} ");
					}
				
					if(expert.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}
