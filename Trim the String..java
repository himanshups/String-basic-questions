// Problem 3 : Trim the String
public class Main
{
	public static void main(String[] args) {
		String s = "                      Hello                                                            ";
		char a[]=s.toCharArray();
		//using inbuilt Method : trim() method
	    System.out.println(s.trim());
	    System.out.println("--------------------------------------------------------");
	    // Using char array logic
	    
	    //start space trim
	    int start = 0,end = a.length-1,count;
	    for(int i = 0;i<a.length;i++){
	        if(a[i]!=' ') {
	            start = i;
	            break;
	        }
	    }
	    //end space trim
	    for(int i = a.length-1;i>start;i--){
	        if(a[i]!=' ') {
	            end = i;
	            break;
	        }
	    }
	    count = end-start+1;
	    String as = new String(a,start,count);
	    System.out.println(as);
	}
}

// Output 
//Hello
//--------------------------------------------------------
//Hello
