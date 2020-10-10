package EntityAndInterfaces;

public class Employee {

	int id;
	String name;
	int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + " Age=" + age + "]";
	}
	
	public int compareTo(Employee e) {
		
		if(this.id == e.id) 
			return 0;
		else if(this.id > e.id)
			return 1;
		else 
			return -1;		
	}
}
