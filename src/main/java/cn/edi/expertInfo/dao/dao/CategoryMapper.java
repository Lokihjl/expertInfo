package cn.edi.expertInfo.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edi.expertInfo.domain.Category;
import cn.edi.expertInfo.domain.response.CategoryResDTO;
import tk.mybatis.mapper.common.Mapper;

public interface CategoryMapper extends Mapper<Category> {

	List<CategoryResDTO> getCategorys(@Param("content") String content);

}