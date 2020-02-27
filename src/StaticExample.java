
public class StaticExample implements Cloneable {
	String name;
	int id;
	static String company="IBM INDIA PVT LTD";
	StaticExample(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	public void display()
	{
		System.out.println(name+" "+id+" "+company);
	}
	public static void main(String args[])
	{
		try
		{
	StaticExample s=new StaticExample("rikita",001);
	StaticExample s1=new StaticExample("sudipta",100);
	
	StaticExample s2=(StaticExample)s.clone();
	s.display();
	s1.display();
	s2.display();
	}
	catch(CloneNotSupportedException e)
	{
		System.out.println(e);
	}
	
	}	
}
