package 상속;

public class Employee {
	
	String name;
	String address;
	int salary;
	int rrn;
	
	public  Employee() {
			
	}
	
	public Employee(String name, String address, int salary, int rrn) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	public void aa() {
		System.out.println("aaa");
	}
	
	public void bb() {
		System.out.println("bb");
	
	}
	
	public void cc() {
		System.out.println("cc");
	
	}
	
	public void dd() {
		System.out.println("dd");
	
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
