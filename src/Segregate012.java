
public class Segregate012 {
	public static void check(int arr[])
	{
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				count++;
			else
				if(arr[i]==1)
					count1++;
				else
					if(arr[i]==2)
						count2++;

		}
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		for(int i=count;i<(count+count1);i++)
		{
			arr[i]=1;
		}
		for(int i=(count+count1);i<arr.length;i++)
		{
			arr[i]=2;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[])
	{
		int arr[]= {2,2,2,2,0,0,0,1,1,1,1,2,1,1,0,0,0,0};
		check(arr);

	}
}
