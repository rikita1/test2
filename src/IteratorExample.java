import java.util.ArrayList;
import java.util.Collections;

public class IteratorExample {

	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(99);
		list.add(1);
		list.add(23);
		list.add(50);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
	}
}
