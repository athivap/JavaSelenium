package javaday3;
public class PrimeNum{
	public static void main(String[]args) {
	int input =7;
	int count=0;
	for(int i=1;i<=input;i++) {
		if (input %i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("Prime number");
	}else {
		System.out.println("Not a prime number");
	}
	
}
}