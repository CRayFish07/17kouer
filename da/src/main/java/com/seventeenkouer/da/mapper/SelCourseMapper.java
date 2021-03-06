package com.seventeenkouer.da.mapper;

import com.seventeenkouer.da.model.SelCourse;

import java.util.List;
import java.util.Map;

public interface SelCourseMapper {
    int deleteByPrimaryKey(String courseId);

    int insert(SelCourse record);

    int insertSelective(SelCourse record);

    SelCourse selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(SelCourse record);

    int updateByPrimaryKey(SelCourse record);

    List<SelCourse> selectByPagination(Map<String,Object> params);
}