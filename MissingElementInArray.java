package week3.day1;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8};
	
		for(int i = 0; i <= arr.length; i++) { 
			if (i!=arr[i+1]) { 
			System.out.println(i);	
			break;	
			}
		}
	}
}
