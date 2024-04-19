import java.util.Scanner;

import javax.naming.InvalidNameException;

public class StringRunner {

	public static void main(String[] args) throws InvalidNameException {
		// TODO Auto-generated method stub
		for(; ; ) {                          //(or) whle(true){
			
		String name="abc";
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter the value");	
			String input=sc.nextLine();
		
 if(input.equals(name))
 {
	 System.out.println("Strings are matching");
 
 }
 
 else
 {
   System.out.println("Strings are not matching");
   try {
   throw new InvalidNameException();
 }
		
		catch (Exception e)
		{
			System.out.println("Exception is handled");
			
}
}
}
}
}

	



