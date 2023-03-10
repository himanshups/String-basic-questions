public class Main
{
	public static void main(String[] args) {
		String s = "Hello world The Coding Competing is best and Ok!";
		char arr[]=s.toCharArray();
		for(int i = 0;i<arr.length;i++){
		    if(arr[i]=='o'||arr[i]=='O'){
		        arr[i]='y';
		    }
		}
		String dup_string = new String(arr);
		System.out.println(dup_string);
	}
}

/* Output:

Original String = "Hello world The Coding Competing is best and Ok!"

After Replacement = Helly wyrld The Cyding Cympeting is best and yk!

*/
