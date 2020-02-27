import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo1 implements Comparable<ComparableDemo1> {

	int age;
	String name;
	String doj;
	ComparableDemo1(int age,String name,String doj)
	{
		this.age=age;
		this.name=name;
		this.doj=doj;
	}
	public int compareTo(ComparableDemo1 c)
	{
		if (this.age==c.age)
		return 0;
		else if(this.age>c.age)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ComparableDemo1> l=new ArrayList<>();
		l.add(new ComparableDemo1(40,"rikita","20-05-2019"));
		l.add(new ComparableDemo1(21,"Sudipta","20-05-2011"));
		Collections.sort(l);
		for(ComparableDemo1 c:l)
		{
			System.out.println(c.age+" "+c.name+" "+c.doj);
		}
System.out.println(l);
	}

}
