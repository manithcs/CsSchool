package com.csschool.model;

public class StudentModel {
    private Integer id;
    private String fullname;
    private String phone;
    private String db;
    private String gender;
    private String age;
    private String nationality;
    private String email;
    private String address;
    private String department;

    public StudentModel() {
    }

    public StudentModel(Integer id, String fullname, String phone, String db, String gender, String age, String nationality, String email, String address, String department) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.db = db;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.email = email;
        this.address = address;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", db='" + db + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", nationality='" + nationality + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
