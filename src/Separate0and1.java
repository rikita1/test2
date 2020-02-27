
public class Separate0and1 {

	public static void check(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}

		for(int i=count;i<arr.length;i++)
		{
			arr[i]=1;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,1,1,1,1,0,0,0,0};
		check(arr);
	}

}
