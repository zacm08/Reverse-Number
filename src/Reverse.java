import java.util.Scanner;
 
class Reverse
{
   public static void main(String args[])
   {
      int a;
      String s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a number");
      //grabbed user input number
      s = in.nextLine();
      //testing to see if input value is integer
      int x = Integer.valueOf(s);
      // a is used to put the numbers in the output array
      //(subtracted one from the length since counting starts at 0)
      a = s.length()-1;
      char[]inputArray = s.toCharArray();
      char[]outputArray = s.toCharArray();  
     
      //to reverse the order of the characters in the input array
		for(int i=0; i < s.length(); i++) {
			
			outputArray[i] = inputArray[a];
			
		a--;
		
		}
		//output the reverse array
		for(int i=0; i < s.length(); i++) {
		System.out.printf("%c" ,outputArray[i]);
				
		}

   }
}