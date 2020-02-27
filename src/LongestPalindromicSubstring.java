
public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s)
	{
		String maxString="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String stmp=s.substring(i,j+1);
				if(isStringPalindrome(stmp)==true)

				{
					if(maxString.length()<stmp.length())
						maxString=stmp;
				}
				
			}
			
		}
		
		return maxString;
		
	}
	public static boolean isStringPalindrome(String s)
	{
		boolean ret = true; 
		for (int i= 0; i< s.length(); i++)
		{
			if (s.charAt(i) != s.charAt(s.length()-1-i))
				ret = false;			   	 
		}
		return ret;
	}

/** Driver Program for running above algorithm */
public static void main(String[] args)
{
	String input[] = {"abcb", "aba","babacd","a"};
	for(int i =0 ; i< input.length; i++)
	{
		System.out.println(" Input Str: "+input[i]+" OutPut: "+ longestPalindrome(input[i]));
	}
}
}