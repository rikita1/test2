import java.util.StringTokenizer;

public class CountWords {

/*	public static int countWords(String str)
	{
		StringTokenizer str1=new StringTokenizer(str);
		return str1.countTokens();
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Amazon is my dream company";
	int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println(count);
	
	//System.out.println(countWords(str));
	}
	}

