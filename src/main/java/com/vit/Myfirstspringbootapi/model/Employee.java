package com.vit.Myfirstspringbootapi.model;

import lombok.*;

import javax.persistence.*;

// lombok
//To remove boilerplate code like getter and setter and constructor and to String etc.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(setterPrefix = "With")
@Entity
@Table(name = "employee", schema = "public")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Automatic generate Id
    Integer Id;
    String name;
    Integer age;
    String Email;
    String Phone;
    String Department;
    String salary;
    String Designation;
}












//    //constructor-------------------------------
//
//    public Employee(Integer id, String name, Integer age, String email, String phone, String department, String salary, String designation) {
//
//        Id = id;
//        this.name = name;
//        this.age = age;
//        Email = email;
//        Phone = phone;
//        Department = department;
//        this.salary = salary;
//        Designation = designation;
//    }
//
//    public Employee() {
//
//    }
//
//    //Getter-------------------------------------
//
//    public Integer getId() {
//        return Id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public String getPhone() {
//        return Phone;
//    }
//
//    public String getDepartment() {
//        return Department;
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public String getDesignation() {
//        return Designation;
//    }
//
//    //Setter -----------------------------
//
//    public void setId(Integer id) {
//        Id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public void setEmail(String email) {
//        Email = email;
//    }
//
//    public void setPhone(String phone) {
//        Phone = phone;
//    }
//
//    public void setDepartment(String department) {
//        Department = department;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }
//
//    public void setDesignation(String designation) {
//        Designation = designation;
//    }

