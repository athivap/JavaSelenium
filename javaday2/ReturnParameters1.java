package javaday2;

public class ReturnParameters1 {
	public float addition(float a, float b) {
		float c=a+b;
		//System.out.println(c);
		return c;
	}
	public void subtraction(float c, double d) {
		double e=c-d;
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReturnParameters1 obj=new ReturnParameters1();
float arithmetic=obj.addition(6.5f, 6.5f);
System.out.println(arithmetic);
obj.subtraction(arithmetic, 5.5);






	}

}
