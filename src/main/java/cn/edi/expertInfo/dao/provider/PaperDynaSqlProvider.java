package cn.edi.expertInfo.dao.provider;

import static cn.edi.expertInfo.util.Constants.PAPERTABLE;

import org.apache.ibatis.jdbc.SQL;

import cn.edi.expertInfo.domain.Paper;

public class PaperDynaSqlProvider {
			// 动态插入
			public String insert(Paper paper){

				return new SQL(){
					{
						INSERT_INTO(PAPERTABLE);
						if(paper.getName() != null ){
							VALUES("name", "#{name}");
						}
						

						
					}
				}.toString();
			}
			// 动态更新
			public String update(Paper paper){

				return new SQL(){
					{
						UPDATE(PAPERTABLE);
						if(paper.getName() != null ){
							SET("name = #{name}");
						}
									

						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}
