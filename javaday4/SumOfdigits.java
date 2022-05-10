package javaday4;

public class SumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6789,sum=0,remainder;
		while(num>0) {
			remainder=num%10;
			sum=remainder+sum;
			num=num/10;
		}
		System.out.println(sum);

	}

}
