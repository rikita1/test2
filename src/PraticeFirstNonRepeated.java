import java.util.HashMap;

public class PraticeFirstNonRepeated {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="rikita";

		HashMap<Character,Integer> h = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);



			if (h.containsKey(c)) {
				h.put(c, h.get(c) + 1);
			} else {
				h.put(c, 1);
			}
			for(Character ch:h.keySet())
			{
				if(h.get(ch)>1)
				{
					System.out.println(c +" "+h.get(ch));
				}
			}

		}

	}

}
