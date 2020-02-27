import java.util.ArrayList;
import java.util.Collections;
 class Employee1 implements Comparable<Employee1> {
	String name;
	int salary;
	Employee1(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	public int compareTo(Employee1 e)
	{
		return this.salary-e.salary;
		
	}
}
	
	

public	class Employee
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Employee1> list=new ArrayList<Employee1>();
	list.add(new Employee1("Rikita",100));
	list.add(new Employee1("rIKI",20));
	Collections.sort(list);
	for(Employee1 e:list)
	{
	System.out.println(list.name+" "+list.salary);

	}

}
