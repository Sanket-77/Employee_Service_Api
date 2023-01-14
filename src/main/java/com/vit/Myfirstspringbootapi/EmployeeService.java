package com.vit.Myfirstspringbootapi;

import com.vit.Myfirstspringbootapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;  // create new object using Autowired

    @Autowired      // Autowired used for constructor create new constructor and use autowire
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createNewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public String deleteEmployeeById(Integer id) throws Exception {
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
        }else {
            throw new Exception("Employee dose not exist. Can not delete");
        }
        return "successfully deleted";
    }

    public Employee editEmployee(Employee employee) throws Exception {
        if (employeeRepository.existsById(employee.getId())){
            return employeeRepository.save(employee);
        }else {
            throw new Exception("Employee dose not Exist. Can not edit");
        }

    }
}


