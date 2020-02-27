
public class FirstNonRepeated {

	public static char check(String str)
	{
		char[] charArray=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(str.lastIndexOf(charArray[i])==str.indexOf(charArray[i]))
				return charArray[i];
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="analogy";
		//System.out.println(check(str));
		
		String str1 = "StudyTonight";
		str1.concat(".com");
		str1 = str1.toUpperCase();
		str1.replace("TONIGHT","today");
		System.out.println(str1);

	}

}
