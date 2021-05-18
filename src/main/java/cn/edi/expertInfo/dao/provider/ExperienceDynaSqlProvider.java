package cn.edi.expertInfo.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Experience;
import static cn.edi.expertInfo.util.Constants.EXPERTTABLE;

public class ExperienceDynaSqlProvider {
	
	// 动态插入
		public String insert(Experience experience){
			
			return new SQL(){
				{
					INSERT_INTO(EXPERTTABLE);
					if(experience.getTitle() != null ){
						VALUES("title", "#{title}");
					}
					if(experience.getRemark() != null ){
						VALUES("remark", "#{remark}");
					}
					if(experience.getDegree() != null ){
						VALUES("degree", "#{degree}");
					}
					if(experience.getEducation() != null ){
						VALUES("education", "#{education}");
					}
					if(experience.getPosition() != null ){
						VALUES("position", "#{position}");
					}
				}
			}.toString();
		}	
		// 动态更新
		public String update(Experience experience){
			
			return new SQL(){
				{
					UPDATE(EXPERTTABLE);
					if(experience.getTitle() != null){
						SET(" title = #{title} ");
					}
				
					if(experience.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}
