import java.util.Scanner;

public class nir {

	public static void main(String[] args) {
		//Write a Java Program to reverse a string without using String inbuilt function.
		//String s="Automation";
		//StringBuilder st=new StringBuilder();
		//st.append(s);
		//st=st.reverse();
		//System.out.println(st);
		
		//second one :
		
		//String str="Automation";
		
		  // char ch[]=str.toCharArray();//converted to character array and printed in reverse order
		   
		   //for(int i=ch.length-1;i>=0;i--) {
			   
			  // System.out.println(ch[i]);
			   
		//}
//third one-using split
/*		String str;
		
		        Scanner in = new Scanner(System.in);
	
		        System.out.println("Enter your String");
		
		        str = in.nextLine();
		
		        String[] token = str.split("");    //used split method to print in reverse order
		
		        for(int i=token.length-1; i>=0; i--)
		
		        {
		
		            System.out.print(token[i] + "");
		
		        }
		    }
	
		}

*/
		
		
		String s, reverse=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		s=sc.nextLine();
		
		int length=s.length();
		for(int i=length-1; i>=0; i--){
			reverse=reverse+s.charAt(i); ////used inbuilt method charAt() to reverse the string
		}
		System.out.println(reverse);
	}
	 	
}


