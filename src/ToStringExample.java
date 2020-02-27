
public class ToStringExample {
	
	int age;
	String name;
	ToStringExample(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public String toString()
	{
		return age+" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringExample obj=new ToStringExample(10,"Rikita");
		System.out.println(obj);
		
		

	}

}
