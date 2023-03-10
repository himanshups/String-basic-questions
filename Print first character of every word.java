import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// Long form method
		for(int i = 0;i<s.length();i++){
		    if(s.charAt(i)!=' '){
		        if(i==0){
		            System.out.print(s.charAt(i)+" ");
		        }
		        else if(s.charAt(i-1)==' '){
		            System.out.print(s.charAt(i)+" ");
		        }
		    }
		}
		System.out.println("\n---------------------------------------------------");
		// short hand cut method
		for(int i = 0;i<s.length();i++){
		    if(s.charAt(i)!=' '&&(i==0 || s.charAt(i-1)==' '))
		        System.out.print(s.charAt(i)+" ");
		}
    }
    
}

/*Output 

                  hello world an 
h w a 
---------------------------------------------------
h w a */
