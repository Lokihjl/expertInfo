package cn.edi.expertInfo.dao.provider;

public class ExpertDynaSqlProvider {
	
//	// 动态插入
//		public String insert(Expert dept){
//			
//			return new SQL(){
//				{
//					INSERT_INTO(DOCUMENTTABLE);
//					if(dept.getTitle() != null ){
//						VALUES("title", "#{title}");
//					}
//					if(dept.getRemark() != null ){
//						VALUES("remark", "#{remark}");
//					}
//					if(dept.getCreateDate() != null ){
//						VALUES("create_date", "#{create_date}");
//					}
//					if(dept.getUserId() != null ){
//						VALUES("user_id", "#{user_id}");
//					}
//					if(dept.getFilename() != null ){
//						VALUES("filename", "#{filename}");
//					}
//				}
//			}.toString();
//		}	
//		// 动态更新
//		public String update(Expert dept){
//			
//			return new SQL(){
//				{
//					UPDATE(DOCUMENTTABLE);
//					if(dept.getTitle() != null){
//						SET(" title = #{title} ");
//					}
//				
//					if(dept.getRemark() != null){
//						SET(" remark = #{remark} ");
//					}
//					WHERE(" id = #{id} ");
//				}
//			}.toString();
//		}
}
