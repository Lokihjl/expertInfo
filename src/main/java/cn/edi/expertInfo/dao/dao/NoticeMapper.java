package cn.edi.expertInfo.dao.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import cn.edi.expertInfo.dao.provider.NoticeDynaSqlProvider;
import cn.edi.expertInfo.domain.Notice;
import cn.edi.expertInfo.util.Constants;
import tk.mybatis.mapper.common.Mapper;

public interface NoticeMapper extends Mapper<Notice> {

  @Select("select * from " + Constants.NOTICETABLE + " order by createDate DESC")
  List<Notice> get_List();

  @Select("select * from " + Constants.NOTICETABLE
      + "  where title like CONCAT('%',#{content},'%') order by createDate DESC")
  List<Notice> get_LikeList(String content);

  @SelectProvider(type = NoticeDynaSqlProvider.class, method = "insert")
  void insert_Info(Notice employee);

  @Select("select * from " + Constants.NOTICETABLE + " where id = #{id}")
  Notice get_Info(Integer id);

  @SelectProvider(type = NoticeDynaSqlProvider.class, method = "update")
  void update_Info(Notice employee);

  // 根据id删除部门
  @Delete(" delete from " + Constants.NOTICETABLE + " where id = #{id} ")
  void delete_Info(Integer id);
}