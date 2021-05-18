package cn.edi.expertInfo.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.edi.expertInfo.dao.provider.ExpertDynaSqlProvider;
import cn.edi.expertInfo.domain.Expert;
import cn.edi.expertInfo.domain.response.ExpertResDTO;
import cn.edi.expertInfo.util.Constants;
import tk.mybatis.mapper.common.Mapper;

public interface ExpertMapper extends Mapper<Expert> {

	// 查询
	@Select("select * from " + Constants.EXPERTTABLE + " order by id ASC")
	List<Expert> get_List();

	@Select("select * from " + Constants.EXPERTTABLE + " where title like CONCAT('%',#{content},'%') order by id ASC")
	List<Expert> get_LikeList(String content);

	@SelectProvider(type = ExpertDynaSqlProvider.class, method = "insert")
	void insert_Info(Expert dept);

	@Select("select * from " + Constants.EXPERTTABLE + " where id = #{id}")
	Expert get_Info(Integer id);

	@SelectProvider(type = ExpertDynaSqlProvider.class, method = "update")
	void update_Info(Expert dept);

	// 根据id删除部门
	@Delete(" delete from " + Constants.EXPERTTABLE + " where id = #{id} ")
	void delete_Info(Integer id);

	List<ExpertResDTO> selectById(@Param("content") String content);
}