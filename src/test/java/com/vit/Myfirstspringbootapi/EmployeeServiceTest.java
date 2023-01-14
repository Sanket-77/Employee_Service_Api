package com.vit.Myfirstspringbootapi;

import com.vit.Myfirstspringbootapi.model.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;


    @Test
    void createANewEmployee() {
        Employee employee = Employee.builder().WithName("sanket").build();
        Mockito.when(employeeRepository.save(any(Employee.class))).then(returnsFirstArg());

        //Call service method to create a new emp
        Employee employeeActual = employeeService.createNewEmployee(employee);
        Assertions.assertThat(employeeActual).isEqualTo(employee);
    }

    @Test
    void getAllEmployees() {
        Employee employee1 = Employee.builder().WithName("sanket").build();
        Employee employee2 = Employee.builder().WithName("prashant").build();
        List<Employee> employeeExpected = Arrays.asList(employee1,employee2);
        Mockito.when(employeeRepository.findAll()).thenReturn(employeeExpected);

        //Call service method get all employee
        List<Employee> employeeListActual = employeeService.getAllEmployee();
        Assertions.assertThat(employeeExpected).isEqualTo(employeeListActual);
    }

    @Test
    void getEmployeeByName() {
        Employee employee = Employee.builder().WithName("sanket").build();
        List<Employee> employeeExpected = Arrays.asList(employee);
        Mockito.when(employeeRepository.findByName("prashant")).thenReturn(employeeExpected);

        //Call service method get  employee by name
        List<Employee> employeeListActual = employeeService.getEmployeeByName("shubham");
        Assertions.assertThat(employeeExpected).isEqualTo(employeeListActual);
    }

    @Test
    void deleteEmployeeById() throws Exception {
        Mockito.when(employeeRepository.existsById(1)).thenReturn(true);
        String msg = employeeService.deleteEmployeeById(1);
        Assertions.assertThat(msg).isEqualTo("successfully deleted ");
    }

    @Test
    void deleteEmployeeById_empDoesNotExist() throws Exception {
        Mockito.when(employeeRepository.existsById(1)).thenReturn(false);
        Assertions.assertThatThrownBy(()->employeeService.deleteEmployeeById(1)).isInstanceOf(Exception.class).hasMessage("Employee does not exist. Can not delete");
    }

    @Test
    void editEmployee() throws Exception {
        Employee employee = Employee.builder().WithId(1).WithName("sanket").build();
        Mockito.when(employeeRepository.existsById(1)).thenReturn(true);
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

        Employee employeeActual  = employeeService.editEmployee(employee);
        Assertions.assertThat(employeeActual).isEqualTo(employee);
    }

}


