
public class RemoveKDigits {
	public static String Remove(String num,int k)
	{
		if(num.length()==k)
			return "0";
		StringBuilder sb=new StringBuilder(num);
		for(int j=0;j<k;j++)
		{
			int i=0;
			while(i<sb.length()-1 && sb.charAt(i)<=sb.charAt(i+1)) {
				i++;
			}
			sb.delete(i, i+1);
		}
		while(sb.length()>1 && sb.charAt(0)=='0')
			sb.delete(0,1);
		if(sb.length()==0)
			return "0";

		return sb.toString();
	}
	public static void main(String args[])
	{
		String str="1234567";
		int k=3;
		System.out.println(Remove(str,k));
	}
}