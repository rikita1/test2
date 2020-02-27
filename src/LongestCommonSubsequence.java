
public class LongestCommonSubsequence {

	static int LCS(String a,String b)
	{
		if(a.length()==0 ||b.length()==0)
			return 0;
		String remA=a.substring(1);
		String remB=b.substring(1);
		if(a.charAt(0)==b.charAt(0))
		{
			int result=LCS(remA,remB);
			return 1+result;
		}
		else
		{
			int result=Math.max(LCS(remA,b), LCS(a,remB));
			return result;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="AGGTAB";
		String s2="GXTXAYB";
		System.out.println(LCS(s1,s2));
	}

}
