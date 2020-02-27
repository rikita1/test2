
public class SameCharactersInString {
	static boolean check(String s)
	{
		int n=s.length();
		for(int i=0;i<n;i++)
			if(s.charAt(i)!=s.charAt(0))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ggge";
		if(check(s))
			System.out.println("yes");
		else
			System.out.println("No");
			


	}

}
