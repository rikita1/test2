
public class Pangram2 {

	public static boolean checkPangram(String str)
	{
		String testString="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String word=Character.toString(ch).toLowerCase();
			System.out.println(word);
			/*testString=testString.replaceAll(word,"");*/
			//if(testString.equals(""))
		//	{
		//		return true;
		//	}
		}
			return false;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi Rikita";
		
		System.out.println(checkPangram(str));

	}

}
