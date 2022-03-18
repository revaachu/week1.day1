package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text1="stops";
		 String text2="potss";
		 
		 if(text1.length()!=text2.length()) {
		  System.out.println("not anagram");
		 }
		 else {
			 char[] string1=text1.toCharArray();
			 char[] string2=text2.toCharArray();
			 
			 Arrays.sort(string1);
			 Arrays.sort(string2);
	 boolean status = Arrays.equals(string1,string2);
			 if(Arrays.equals(string1,string2)==true) {
				 System.out.println("anagram");
			 }
		 }
	}
	
}
		

	


