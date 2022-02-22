package week1.day2;

public class Mymobile {
	static int num=1828;
	static char name='r';
	static long mobilenumber=7708544875l;
	static boolean ismobilecharged=true;
	 public void makecall() {
		 System.out.println("makecall");
	 }
	 public void sendmsg() {
		 System.out.println("sendmsg");
	 }
	 private void paybills() {
		 System.out.println("paybills");
	 }
public static void main(String[]args) {
	System.out.println(num);
	System.out.println(name);  
	System.out.println(mobilenumber);
	System.out.println(ismobilecharged);
	Mymobile data=new Mymobile();
	data.makecall();
	data.sendmsg();
	data.paybills();
}
}
	
	
	
	
	
	
	
	
	


