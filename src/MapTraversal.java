import java.util.HashMap;
import java.util.Map;
import java.util.Map;

public class MapTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("riki",100);
		map.put("sudi", 200);
		map.put("sam", 300);
		for(String s:map.keySet())
		{
			System.out.println(s);
		}
		for(Integer i:map.values())
		{
			System.out.println(i);
		}
		
		for(Map.Entry<String,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		String s=null;
		System.out.println(s.toString());
		System.out.println("hello");
		Float f=12.3F;
				System.out.println(Float.valueOf(f));
		

	}

}
