package javaday4;

public class amstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=153;
int sum=0;
int reminder = 0;
int temp=n;
while(n>0) {
	reminder= n %10;
	sum=sum+(reminder*reminder*reminder);
	n=n/10;
	
	
	
}
if(sum==temp) {
	System.out.println(" it is amstrong number");
}else {System.out.println("not amstrong number");
}
}
	}


