package com.vit.Myfirstspringbootapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Get == search / Fetch
//post == create new
//put == updating Existing Entity
//Delete = Delete Entity

//annotations - Metadata (Information about data)

@SpringBootApplication

public class MyFirstSpringbootApi_Application {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringbootApi_Application.class, args);}
}











//	Employee employee0 = Employee.builder().WithId(1).WithName("Sanket").WithAge(25).WithEmail("sanketcjhavan4686@gmail.com").build();
//	Employee employee1 = Employee.builder().WithAge(27).WithId(2).WithName("Prashant").WithEmail("prashantpowar7972@gmail.com").build();
//	Employee employee2 = Employee.builder().WithName("Shubham").WithId(3).WithAge(26).WithEmail("shubhammankame8790@gmail.com").build();
//	List<Employee> employeelist = new ArrayList<>();
//
//	// http://localhost:8082/employee
//	@GetMapping("/employee")
//	public Employee getEmployee(){
////		Employee employee = new Employee();
////		employee.setName("sanket");
////		employee.setAge(25);
////		employee.setEmail("sanketchavan4686@gmail.com");
////		employee.setPhone("9637967737");
////		employee.setDepartment("HR");
////		employee.setDesignation("lead");
//
//		//Instead of creating object like above using setters /*******************
//		//using builder design pattern also known as method chaining /************
//
//		//Employee employee0 = Employee.builder().WithId(1).WithName("Sanket").WithAge(25).WithEmail("sanketcjhavan4686@gmail.com").build();
//		return employee0;
//	}
//
//	private void WithId(int i) {
//	}
//
//	//http://localhost:8082/All_employees
//	@GetMapping("/All_employees")
//	public List<Employee> getAllEmployee(){
//
////		Employee employee1 = new Employee();
////		employee1.setName("sanket");
////		employee1.setAge(25);
////		employee1.setEmail("sanketchavan4686@gmail.com");
////		employee1.setPhone("9637967737");
////
////		Employee employee2 = new Employee();
////		employee2.setName("prashant");
////		employee2.setAge(27);
////		employee2.setEmail("prashantpowar1234@gmail.com");
////		employee2.setPhone("7972173040");
//
//		//Employee employee1 = Employee.builder().WithAge(27).WithId(2).WithName("Prashant").WithEmail("prashantpowar7972@gmail.com").build();
//		//Employee employee2 = Employee.builder().WithName("Shubham").WithId(3).WithAge(26).WithEmail("shubhammankame8790@gmail.com").build();
//
//		//List<Employee> employeelist = new ArrayList<>();
//		employeelist.add(employee1);
//		employeelist.add(employee2);
//		return employeelist;
//	}
//
//	// http://localhost:8082/employee/sanket
//	@GetMapping("/employee/{name}")
//	public Object getEmployee(@PathVariable String name){
//		if (name.contains("sanket")){
//			return employee0;
//		}else if (name.contains("prashant")){
//			return employee1;
//		} else if (name.contains("shubham")) {
//			return employee2;
//		}else {
//			return "Error: no such employee exists. " + name;
//		}
//	}
//
//	@PostMapping("/employee")
//	public void createNewEmployee(@RequestBody Employee employee){
//		employeelist.add(employee);
//	}






