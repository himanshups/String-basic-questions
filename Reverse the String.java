import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
		String s = "Hello";
		// Method1 : String Builder Inbuilt Function 
		StringBuilder str = new StringBuilder(s);
		str=str.reverse();
		System.out.println(str);
		System.out.println("-------------------------------------------------------------------");
		// Method2 : Logic 1 with O(n) Space and Time complexity
		String fin = "";
		for(int i = 0;i<s.length();i++){
		    char ch = s.charAt(i);
		    fin = ch+fin;
		}
		System.out.println(fin);
		System.out.println("-------------------------------------------------------------------");
        // Method 3 : Logic 2 with O(n/2) Time and O(1) Space complexity
        char arr[] = s.toCharArray();
        int start = 0,end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i :arr)System.out.print(i);
        // Method 4 : Logic 3 Using stack 
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++) stack.push(s.charAt(i));
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        // End of the Program
	}
}

/*
Output of the Program

olleH
-------------------------------------------------------------------
olleH
-------------------------------------------------------------------
olleH
-------------------------------------------------------------------
olleH



*/
