
package week3.day2;

import java.util.Arrays;

public class CharOccurance {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "welcome to chennai";
		 char search ='e';
		 int count=0;
		 char[] Arrayinput=input.toCharArray();
			Arrays.sort(Arrayinput);
			int inputLength =input.length();
			for (int i = 0; i<input.length(); i++) {
				if(input.charAt(i) == search)
				      count++;
				 }
			System.out.println("The Character '"+search+"' appears "+count+" times.");
		  }
				

}
