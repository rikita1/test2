
public class ReverseString1 {
public static  String check(String str)
{
	String s=str.replaceAll("\\s+","");
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="mom";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		if(reverse.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}*/
	String s="My dream company is Amazon";
	System.out.println(check(s));
	
	}

}
