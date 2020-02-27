
public class ExtraCharInString {

	static char findExtra(String str1,String str2)
	{
		char strA[]=str1.toCharArray();
		char strB[]=str2.toCharArray();
		int m1[]=new int[256];
		for(int i=0;i<strB.length;i++)
			m1[strB[i]]++;
		System.out.println(strB);
		for(int i=0;i<strA.length;i++)
			m1[strA[i]]--;
		System.out.println(strA);
		for(int i=0;i<m1.length;i++)
		{
			if(m1[i]==1)
				return (char) i;
		}
		
		return Character.MIN_VALUE;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="DCBA";
		String str2="EDBCA";
		System.out.println(findExtra(str,str2));

	}

}
