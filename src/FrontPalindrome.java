
public class FrontPalindrome {
	static boolean checkPalindrome(String s)
	{
		int l=s.length()-1;
		for(int i=0,j=l-1;i<=j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		int flag=0;
		int cnt=0;
		String s="BABABAA";
		while(s.length()>0)
		{
		if(checkPalindrome(s))
		{
			flag=1;
			break;
		}
		else
		{cnt++;
		s=s.substring(0,s.length()-1);
		}
		}
		if(flag==1)
		{
			System.out.println(cnt);
		}
			
	}

}
