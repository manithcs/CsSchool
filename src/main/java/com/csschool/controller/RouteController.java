package com.csschool.controller;

import com.csschool.model.StudentModel;
import com.csschool.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RouteController {

    private StudentService studentService;
@Autowired
    public RouteController(StudentService studentService) {
        this.studentService = studentService;
    }

    //List all Student
    @RequestMapping({"/","student_list"})
    public String StudentListPage(ModelMap modelMap){
    modelMap.addAttribute("student",studentService.findAll());
        System.out.println("list page is working hello");
    return "/Student/StudentListPage";
    }
   //View Student By ID
    @RequestMapping({"/student/{id}"})
    public String StudentViewById(@PathVariable("id") Integer id ,ModelMap modelMap){
    modelMap.addAttribute("student",studentService.findById(id));
        System.out.println(studentService.findById(id));
        System.out.println("view page is running ");
    return "/Student/StudentViewPage";
    }

    //Delete Student
    //why modelmap Bcuz Need to show data in other form
    @RequestMapping("/student/{id}/delete")
    public String DeleteStudentById(@PathVariable ("id") Integer id ,ModelMap modelMap){
    modelMap.addAttribute("",studentService.deleteByStudentId(id));
    return  "redirect:/";
    }

    /**
     * route same name as link in html*/
    @RequestMapping("/StudentInsertPage")
    public String StudentInsertPage(ModelMap modelMap){
        modelMap.addAttribute("student",new StudentModel());
        return "/Student/StudentInsertPage";
    }

    //get data from object
    //use with action form
    @PostMapping("/StudentInsertPage")
    public String InsertStudent(@ModelAttribute StudentModel studentModel){
        if(studentService.save(studentModel)){
            System.out.println("sucessful insert data");
        }else System.out.println("Fail Insert data");
    return  "redirect:/" ;
    }

    @RequestMapping("/student/{id}/update")
    public String UpdateStudentPage(@PathVariable("id")Integer id ,ModelMap modelMap){
        modelMap.addAttribute("student",studentService.findById(id));
        return "/Student/StudentUpdatePage";
    }
    @PostMapping("/StudentUpdatePage")
    public String UpdateStudent(@ModelAttribute StudentModel studentModel){
            if(studentService.update(studentModel)){
                System.out.println("Update Student  sucessful ");

            }else System.out.println("fail update");
       return  "redirect:/" ;
    }

}
