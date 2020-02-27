import java.util.stream.Stream;

public class StreamExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[]= {"riki","tiki"};
	char arr1[]= {'a','b'};
		Stream<String> stream=Stream.of(arr);
		stream.forEach(x->System.out.println(x));
		int a=-4;
		int b = 4;
		double d=20.5;
		System.out.println((a%10+" "+(d%10)));
		System.out.println(a>>2);
		System.out.println(b>>1);
	}

}
