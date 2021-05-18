package cn.edi.expertInfo.service;

import com.github.pagehelper.PageInfo;

import cn.edi.expertInfo.domain.Experience;

public interface ExperienceService {

  PageInfo getExperience(int pageNum, int pageSize, String content);

  void insert(Experience experience, Integer id);
}
