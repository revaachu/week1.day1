package week3.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range,firstsum,secsum,sum;
		range=8;
		firstsum=0;
		secsum=1;
		System.out.println(firstsum);
		System.out.println(secsum);
		for(int i=1;i<=range;i++) {
			sum=firstsum+secsum;
			firstsum=secsum;
			secsum=sum;
			System.out.println(sum);
			}
	}

}

