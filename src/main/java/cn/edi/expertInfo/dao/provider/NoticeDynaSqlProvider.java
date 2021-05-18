package cn.edi.expertInfo.dao.provider;

import static cn.edi.expertInfo.util.Constants.NOTICETABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Notice;

public class NoticeDynaSqlProvider {
			// 动态插入
			public String insert_Notice(Notice job){
				
				return new SQL(){
					{
						INSERT_INTO(NOTICETABLE);
						if(job.getTitle() != null ){
							VALUES("title", "#{title}");
						}
						if(job.getUserId()!=null){
							VALUES("user_id","#{user_id}");
						}
						if(job.getContent()!=null){
							VALUES("content","#{content}");
						}
						if(job.getCreateDate()!=null){
							VALUES("createDate","#{createDate}");
						}
					
						
					}
				}.toString();
			}	
			// 动态更新
			public String update_Notice(Notice job){
				
				return new SQL(){
					{
						UPDATE(NOTICETABLE);
						if(job.getTitle() != null ){
							SET("title = #{title}");
						}
						if(job.getUserId()!=null){
							SET("user_id = #{user_id}");
						}
						if(job.getContent()!=null){
							SET("content = #{content}");
						}
						if(job.getCreateDate()!=null){
							SET("createDate = #{createDate}");
						}
				
						
						
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
