import java.util.HashSet;

public class UniqueCharactersString {

	public static boolean check(String str)
	{
		HashSet h=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!h.add(c))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rik";
		System.out.println(check(str));

	}

}
