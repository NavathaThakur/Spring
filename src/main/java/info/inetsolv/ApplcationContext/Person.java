package info.inetsolv.ApplcationContext;

public class Person {

	private Integer pid;
	private String name;
	private double salary;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}
	 
	
	
}
