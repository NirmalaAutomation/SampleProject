package Spaces;

public class spa {

	public static void main(String[] args) {
		// Write a Java Program to remove all white spaces from a string without using replace().
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";

        char[] chars = str1.toCharArray();
  
      //  StringBuffer sb = new StringBuffer();

        for (int i = 0; i < chars.length; i++)

        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )

            {

                //sb.append(chars[i]);
                 System.out.print(chars[i]); 
            }
            //System.out.print(sb); 
        }
                

    }

}

