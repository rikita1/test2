
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'c'; 
	    int num = ch; 
	    
	    System.out.println(num);
	    ch = (char)num; 

	    
	    String s1 = "abc";
        String s2 = "def";
        //String s3 = s2;   /* Line 7 */
        s2 = "ghi";
        System.out.println(s1 + s2);
	    
	    
	}

}
