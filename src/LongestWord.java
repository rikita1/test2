
public class LongestWord {

	public static int find(String str)
	{
		String[] words = str.split(" "); 
        int length = 0; 
          
        for(String word:words){ 
            if(length > word.length()){ 
                length = word.length(); 
            }  
        } 
        return length; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am Rikita";
		System.out.println(find(s));
		

	}

}
