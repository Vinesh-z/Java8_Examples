package JavaIteratorAndForeach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import EntityAndInterfaces.Employee;

public class Java8Iterating {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<>();
		Map<Integer, Employee> empMap = new HashMap<>(); 
		
		employees.add(new Employee(1, "Vinesh"));
		employees.add(new Employee(2, "Nandan"));
		employees.add(new Employee(3, "Sam"));
		
		empMap.put(1, new Employee(1, "Vinesh"));
		empMap.put(2, new Employee(2, "Nandan"));
		empMap.put(3, new Employee(3, "Ronak"));
		
		//Old For Each
		System.out.println("\nUsing Old For Each");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		//Using Lamda Foreach
		System.out.println("\nUsing Old For Each");
		employees.forEach(e -> {
			System.out.println(e);
		});
		
		//Iterator
		System.out.println("\nUsing Iterator");
		Iterator<Employee> employeeIterator = employees.iterator();
		while(employeeIterator.hasNext()) {
			System.out.println(employeeIterator.next());
		}
		
		//Foreach Map
		System.out.println("\nForeach MAp");
		empMap.forEach((Key, Value) -> System.out.println(Value));
		
		System.out.println("\nForeach MAp With functioanl foreach");
		empMap.forEach((Key, Value) -> {
			if(Key > 2) 
				System.out.println(Value);
			
		});
		
		Stream<Map.Entry<Integer, String>> mapStream = (Stream<Entry<Integer, String>>) empMap;
		
	}
}
