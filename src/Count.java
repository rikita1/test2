
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		String str="Hel-lloo-345";
		for(int i=0;i<str.length()-1 ;i++)
		{
			if(str.charAt(i)==' ')
				count++;
				
		}
		System.out.println(count);
	}


}
