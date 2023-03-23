package com.csschool.service.implement;

import com.csschool.model.StudentModel;
import com.csschool.repository.StudentRepository;
import com.csschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("StudentRepo")
    private StudentRepository studentRepository;


    @Override
    public List<StudentModel> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel findById(Integer id) {
      return studentRepository.findById(id);
    }


    @Override
    public boolean save(StudentModel studentModel) {

//        studentModel.setFullname(studentModel.getFullname().toUpperCase());
        return studentRepository.save(studentModel);
    }

    @Override
    public boolean deleteByStudentId(Integer id) {
        return  studentRepository.deleteByID(id);
    }

    @Override
    public boolean update(StudentModel studentModel) {
        return studentRepository.update(studentModel);
    }
}
