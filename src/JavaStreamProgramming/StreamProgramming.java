package JavaStreamProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import EntityAndInterfaces.Employee;
import EntityAndInterfaces.EmployeeComparator;

public class StreamProgramming {

	public static void main(String Args[]) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Vinesh", 24));
		employees.add(new Employee(2, "Shaina", 24));
		employees.add(new Employee(3, "Parvathy", 21));
		employees.add(new Employee(4, "Raj", 28));
		employees.add(new Employee(5, "Abhishek", 28));
		employees.add(new Employee(6, "Sonu", 38));

		//		Comparator<Employee> employeeLamdaComparator =  (Employee e1, Employee e2) -> {
		//			return e1.getAge();
		//		}


		List<Employee> eligibleEmployees = employees.stream().filter(e -> e.getAge() > 24).collect(Collectors.toList());

		eligibleEmployees.forEach(System.out::println);

		System.out.println("\nUsing filters and maps");
		List<Employee> updatedEmployees = employees.stream()
				.map(e -> {
					if (e.getName().equals("Vinesh")) {
						e.setName("Vin");
					}
					return e;
				})
				.filter(e -> e.getName()
						.startsWith("S"))
				.filter(e -> e.getAge() >= 24)
				.collect(Collectors.toList());
		
		updatedEmployees.forEach(System.out::println);


		Comparator<Employee> employeeLamdaComparator = Comparator.comparing(Employee::getName);

		List<Employee> sortByName = employees.stream()
				.sorted(employeeLamdaComparator)
				.collect(Collectors.toList());

		EmployeeComparator empComp = new EmployeeComparator();

		List<Employee> sortByAge = employees.stream()
				.sorted(empComp)
				.collect(Collectors.toList());


		System.out.println("\nsorted List");
		sortByName.forEach(e-> {
			System.out.println(e);
		});

		System.out.println("\nsorted List 2");
		sortByAge.forEach(e-> {
			System.out.println(e);
		});

	}
}
