package Spaces;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String ss="Java";// right now it will print the Java only, 
        ss.concat("Selenium");//it can't not append with particular it is not going to concate 

             String ss1=ss.concat("Selenium"); //but i can do the concatation and i can add the string with string ,this particualr i am storing the ss1,i am not
//changing the value of ss, i am appending java with selenium.final output is java and "javaselenium"
       //   -for suppose i am going to print here below like (System.out.println(ss1);)
  System.out.println(ss);//This line will be immutable , it cannot change 
  System.out.println(ss1);

//for suppose in stringbuffer , we can have append means adding 
//here we stringbuffer is we can change -output is QTP,QTPVBSCRIPT
  
  StringBuffer sb=new StringBuffer("QTP");
  System.out.println(sb);
  sb.append("VBSCRIPT");//storing the value
  System.out.println(sb);

}
}

