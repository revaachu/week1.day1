package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a automation tester";
		String[] words=test.split(" ");
		String revString="";
		
		for(int i=0;i<words.length;i++) {
			if(i%2!=0) {
				String S="";
				char[] even=words[i].toCharArray();
				
for(int j=even.length-1;j>=0;j--) {
	S=S+even[j];
}
	revString=revString+" "+S;
		}
			else {
				revString=revString+" "+words[i];
			}}
		System.out.println(""+revString);
		}



}
