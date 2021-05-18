package cn.edi.expertInfo.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.edi.expertInfo.dao.provider.RewardDynaSqlProvider;
import cn.edi.expertInfo.domain.Experience;
import cn.edi.expertInfo.domain.response.ExperienceResDTO;
import cn.edi.expertInfo.util.Constants;
import tk.mybatis.mapper.common.Mapper;

public interface ExperienceMapper extends Mapper<Experience> {


  List<ExperienceResDTO> getExperiences(@Param("content") String content);

  //查询
  @Select("select * from " + Constants.DEPTTABLE + " order by id ASC ")
  List<Experience> selectAllExperience();

  @Select(
      "select * from " + Constants.DEPTTABLE + " where name like CONCAT('%',#{content},'%')  order by id ASC")
  List<Experience> selectLikeAllExperience(String content);


  @SelectProvider(type = RewardDynaSqlProvider.class, method = "insertDept")
  void save(Experience experience);

  @Select("select * from " + Constants.DEPTTABLE + " where id = #{id}")
  Experience get_Info(Integer id);

  @SelectProvider(type = RewardDynaSqlProvider.class, method = "updateDept")
  void update_Info(Experience experience);

  // 根据id删除部门
  @Delete(" delete from " + Constants.DEPTTABLE + " where id = #{id} ")
  void delete_Info(Integer id);
}