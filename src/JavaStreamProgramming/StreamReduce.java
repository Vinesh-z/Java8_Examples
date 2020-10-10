package JavaStreamProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import EntityAndInterfaces.Employee;

public class StreamReduce {

	public static void main(String Args[]) {
		int numbers[] = {23, 54, 3, 243, 425, 5};
		
		String strArrray[] = { "Hai", "iam", "Vinesh"};
		
		List<Employee> employees = new ArrayList<>(); 

		employees.add(new Employee(1, "Vinesh", 24));
		employees.add(new Employee(2, "Neha", 24));
		employees.add(new Employee(3, "Sameer", 21));
		employees.add(new Employee(3, "Nandan", 28));
		employees.add(new Employee(3, "Ronak", 28));
		employees.add(new Employee(3, "Sam", 38));
		
		OptionalInt sum1 =  Arrays.stream(numbers)
				.limit(4)
				.reduce((x, y) -> x+y);
		
		OptionalInt sum2 = Arrays.stream(numbers)
				.reduce(Integer::sum);
		
		String longestWord = Arrays.stream(strArrray)
				.reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
		
		 Employee eldestEmployee = employees.stream()
				 .reduce((emp1, emp2) -> emp1.getAge() > emp2.getAge() ? emp1 : emp2).get();
		
		
		System.out.println("Sum1 = " + sum1.getAsInt() + 
				"\nSum2 = " + sum2.getAsInt() + 
				"\nLongest Word = " + longestWord);
		
		System.out.println(eldestEmployee);				
		
	}
}
