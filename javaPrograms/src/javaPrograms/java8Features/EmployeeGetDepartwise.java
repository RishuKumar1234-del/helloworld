package javaPrograms.java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private String email;
	
	public Employee(int id,String name,String email) {
		this.id=id;
		this.email=email;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	

	
	
	
	
}

class CompareByid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2) {
		
		
		return o1.getId()-o2.getId();
	}
	
}
public class EmployeeGetDepartwise {

	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(21,"Er.Govind", "govind123@gmail.com"));
		employees.add(new Employee(26,"gorakh kumar", "gorakh123@gmail.com"));
		employees.add(new Employee(23,"kunal", "kunal123@gmail.com"));
		employees.add(new Employee(22,"er.risi prabh mishra", "roshan123@gmail.com"));
		employees.add(new Employee(21,"Er.Rahul upadhay", "rahul123@gmail.com"));
		employees.add(new Employee(21,"Er.Govind", "govind1234@gmail.com"));
		
		Collections.sort(employees, new CompareByid());
		
		for(int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		
//		  Map<String,Long> collect = employees.stream().
//				collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
//		System.out.println(collect);
		
		

	}

}
