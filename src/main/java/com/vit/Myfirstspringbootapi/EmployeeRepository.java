package com.vit.Myfirstspringbootapi;

import com.vit.Myfirstspringbootapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Query select * from employee insert into
//sql
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);


}
