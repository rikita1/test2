import java.util.Arrays;

public class Anagram {
	
	static boolean check(String str1,String str2)
	{
		boolean status=true;
		String s1=str1.replaceAll("\\s","");
		System.out.println(s1);
		String s2=str2.replaceAll("\\s", "");
		char[] arr1=s1.toLowerCase().toCharArray();
		System.out.println(arr1);
		char[] arr2=s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		System.out.println(arr1);
		Arrays.sort(arr2);
		status=Arrays.equals(arr1,arr2);
		if(status)
			return status;
		else
			return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dbac";
		String s2="dcbe";
		System.out.println(check(s1,s2));
		

	}

}
