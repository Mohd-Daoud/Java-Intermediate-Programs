package MethodChain;

public class methodChaining {
	String name;
	int id ;
	double salary;
	int age;
	public methodChaining(String name, int id, double salary, int age)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	public methodChaining getName()
	{
		System.out.println("Name is : "+name);
		return this;
	}public methodChaining getid()
	{
		System.out.println("Id is : "+id);
		return this;
	}public methodChaining getage()
	{
		System.out.println("Age is : "+age);
		return this;
	}public methodChaining getsalary()
	{
		System.out.println("Salary is : "+salary);
		return this;
	}
}
