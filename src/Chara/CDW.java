package Chara;

public class CDW {

	public static void main(String[] args) {
		String input="Welcome to Java Session Session Session"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		int count=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					count=count+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
			System.out.println(words[i]+"---"+count);	//Printing the word along with count
			count=1;
			
	     }  
			
	}

}

