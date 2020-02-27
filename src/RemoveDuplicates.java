import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] numbers=new Integer[]{5,5,7,9,1,4,4};
		LinkedHashSet<Integer> hashSet=new LinkedHashSet<>(Arrays.asList(numbers));
		Integer[] numberWithoutDuplicates=hashSet.toArray(new Integer[] {});
		System.out.println(Arrays.toString(numberWithoutDuplicates));
		
	}

}
