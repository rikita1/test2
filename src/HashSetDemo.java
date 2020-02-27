import java.util.HashSet;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> h=new LinkedHashSet<>();
		h.add(123);
		h.add(321);
		h.add(5);
		h.add(null);
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
