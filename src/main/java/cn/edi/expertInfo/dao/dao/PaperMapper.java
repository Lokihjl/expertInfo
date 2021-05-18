package cn.edi.expertInfo.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.edi.expertInfo.dao.provider.PaperDynaSqlProvider;
import cn.edi.expertInfo.domain.Paper;
import cn.edi.expertInfo.domain.response.PaperResDTO;
import cn.edi.expertInfo.util.Constants;
import tk.mybatis.mapper.common.Mapper;

public interface PaperMapper extends Mapper<Paper> {

  /**
   *
   * @return
   */
  //查询
  @Select("select * from " + Constants.PAPERTABLE + " order by id ASC")
  List<Paper> get_List();

  @Select("select * from " + Constants.PAPERTABLE
      + "  where name like CONCAT('%',#{content},'%')  order by id ASC")
  List<Paper> get_LikeList(String content);


  @SelectProvider(type = PaperDynaSqlProvider.class, method = "insert")
  void insert_Info(Paper employee);

  @Select("select * from " + Constants.PAPERTABLE + " where id = #{id}")
  Paper get_Info(Integer id);

  @SelectProvider(type = PaperDynaSqlProvider.class, method = "update")
  void update_Info(Paper employee);

  // 根据id删除部门
  @Delete(" delete from " + Constants.PAPERTABLE + " where id = #{id} ")
  void delete_Info(Integer id);


  @Select("SELECT\n"
      + "\te.*,e.createDate as createDate, d.`name` AS dept,\n"
      + "\tj.`name` AS job\n"
      + "FROM\n"
      + "\temployee e\n"
      + "LEFT JOIN dept d ON d.id = e.dept_id\n"
      + "LEFT JOIN job j ON j.id = e.job_id  order by e.id ASC")
  List<PaperResDTO> getEm();

  @Select("SELECT\n"
      + "\te.*,e.createDate as createDate, d.`name` AS dept,\n"
      + "\tj.`name` AS job\n"
      + "FROM\n"
      + "\temployee e\n"
      + "LEFT JOIN dept d ON d.id = e.dept_id\n"
      + "LEFT JOIN job j ON j.id = e.job_id where name like CONCAT('%',#{content},'%') order by e.id ASC")
  List<PaperResDTO> getEmByContent(String content);

  List<PaperResDTO> getEmployees(@Param("content") String content);
}