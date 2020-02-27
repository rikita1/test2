/*
 * for(int i=0;i<arr.length-1;i++)
 * {
 * int index=i;
 * for(int j=i+1;j<arr.length;j++)
 * {
 * if(arr[j]<arr[index]
 * {
 * index=j;
 * }
 * }
 * int smaller=arr[index];
 * arr[index]=arr[i];
 * arr[i]=smaller;
 * }
 */
public class SelectionSort {
	public static void check(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int smaller=arr[index];
			arr[index]=arr[i];
			arr[i]=smaller;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {5,6,1,10,7};
			check(arr);

		}

	}
