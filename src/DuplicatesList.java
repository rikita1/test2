import java.util.*;

public class DuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("riki");
		a.add("sam");
		a.add("app");
		a.add("riki");
		ArrayList<String> uniqueE=new ArrayList<>();
		uniqueE=new ArrayList(new HashSet(a));
		for(String s:uniqueE)
		{
			System.out.println(s);
		}
		

	}

}
