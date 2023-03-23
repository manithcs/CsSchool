package com.csschool.model;

public class CourseModel {
   private Integer id;
   private String classId;
   private String className;
   private String year;
   private String description;
   private String createDate;
   private String department;

   public CourseModel(){

   }

    public CourseModel(Integer id, String classId, String className, String year, String description, String createDate, String department) {
        this.id = id;
        this.classId = classId;
        this.className = className;
        this.year = year;
        this.description = description;
        this.createDate = createDate;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "id=" + id +
                ", classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", createDate='" + createDate + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
