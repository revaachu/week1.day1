package week1.day2;
public class Calculator {
public void add() {
    	int a= 10;
    	int b= 8;
    	int c= 7;
    	System.out.println(a+b+c);
  }
  public void sub() {
	    int m=20;
	    int n= 9;
  System.out.println(m-n);
  }
  public void mul() {
	  double p=123.46;
	  double q=6.4;
	  System.out.println(p*q);
  }
  public void div() {
	  float g= 85.66f;
	  float h= 40.67f;
	  System.out.println(g/h);
  }
  public static void main(String[]args) {
  Calculator c=new Calculator();
  c.add();
  c.sub();
  c.mul();
  c.div();
  }
}
