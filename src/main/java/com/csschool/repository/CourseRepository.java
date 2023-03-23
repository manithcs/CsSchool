package com.csschool.repository;

import com.csschool.model.CourseModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CourseRepo")
public interface CourseRepository {

   @Select("select id, courseid ,coursename ,year, description, createdate, department from course")
   public List<CourseModel>findAll();


}