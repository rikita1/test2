import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterString {

	public static void Duplicate(String str)
	{
		char[] array=str.toCharArray();
		HashMap<Character,Integer> hashMap=new HashMap<>();
		for(char c:array)
		{
			if(hashMap.containsKey(c))
			{
				hashMap.put(c, hashMap.get(c)+1);
			}
			else
			{
				hashMap.put(c, 1);
			}
		}
		Set<Character> charString=hashMap.keySet();
		for(Character ch:charString)
		{
			if(hashMap.get(ch)>1)
			{
				System.out.println(ch+"= "+ hashMap.get(ch));
			}
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate("rikita");

	}

}
