package com.csschool.service;

import com.csschool.model.StudentModel;

import java.util.List;


public interface StudentService {

    public List<StudentModel> findAll();
    public StudentModel findById(Integer id);
    public boolean save(StudentModel studentModel);
    public boolean deleteByStudentId(Integer id);
    public boolean update (StudentModel studentModel);






}
