package cn.edi.expertInfo.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.edi.expertInfo.dao.provider.PatentDynaSqlProvider;
import cn.edi.expertInfo.domain.Patent;
import cn.edi.expertInfo.domain.response.PatentResDTO;
import cn.edi.expertInfo.util.Constants;
import tk.mybatis.mapper.common.Mapper;

public interface PatentMapper extends Mapper<Patent> {

  @Select("select * from " + Constants.PATENTABLE + " order by id ASC ")
  List<Patent> get_List();

  @Select(
      "select * from " + Constants.PATENTABLE
          + "  where name like CONCAT('%',#{content},'%') order by id ASC")
  List<Patent> get_LikeList(String content);


  @SelectProvider(type = PatentDynaSqlProvider.class, method = "insert")
  void insert_Info(Patent patent);

  @Select("select * from " + Constants.PATENTABLE + " where id = #{id}")
  Patent get_Info(Integer id);

  @SelectProvider(type = PatentDynaSqlProvider.class, method = "update")
  void update_Info(Patent patent);

  // 根据id删除部门
  @Delete(" delete from " + Constants.PATENTABLE + " where id = #{id} ")
  void delete_Info(Integer id);

  List<PatentResDTO> findAll(@Param("content") String content);

  List<Patent> getJob(int id);
}