package com.csschool.repository;

import com.csschool.model.StudentModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("StudentRepo")
public interface StudentRepository {

    @Select("SELECT id,fullname,phone,db,gender,age,nationality,email,address,department from student ")
    public List<StudentModel> findAll();



    @Insert("insert into student (fullname,phone,db,gender,age,nationality,email,address,department)" +
            " values(#{Student.fullname},#{Student.phone},#{Student.db},#{Student.gender},#{Student.age}" +
            ",#{Student.nationality},#{Student.email}, #{Student.address}, #{Student.department})")
   @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty ="Student.id")
    public boolean save(@Param("Student") StudentModel studentModel);


    @Delete("delete from student where id=#{studentId}")
    public boolean deleteByID(@Param("studentId") Integer id);

    @Select("select * from student where id=#{studentId}")
    public StudentModel findById(@Param("studentId") Integer id);

@Update("Update student set  fullname=#{Student.fullname},phone= #{Student.phone},db=#{Student.db},gender = #{Student.gender},age=#{Student.age}, nationality=#{Student.nationality},email= #{Student.email},address= #{Student.address}, department=#{Student.department} where id=#{Student.id}")
    public boolean update (@Param("Student") StudentModel studentModel);

}
