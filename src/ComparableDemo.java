import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo implements Comparable<ComparableDemo>{

	String firstname;
	String lastName;
	ComparableDemo(String firstname,String lastName)
	{
		this.firstname=firstname;
		this.lastName=lastName;
	}
	public int compareTo(ComparableDemo c)
	{
		int last=this.lastName.compareTo(c.lastName);
		return last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ComparableDemo> l=new ArrayList<>();
		l.add(new ComparableDemo("rikita","bhattacharya"));
		l.add(new ComparableDemo("Sushovon","Ghosh"));
		Collections.sort(l,Collections.reverseOrder());
		for(ComparableDemo c:l)
		{
			System.out.println(c.firstname+" "+c.lastName);

		}
	}

}
