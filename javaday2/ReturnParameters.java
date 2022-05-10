package javaday2;

public class ReturnParameters {
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public float sub(float a, float b) {
		float c=a-b;
		return c;
	}
public static void  main(String[] args) {
		// TODO Auto-generated method stubeturnParameters();
	ReturnParameters object =new ReturnParameters(); 
		
		
		int retu =object.add(17, 13);

		System.out.println(retu);
		System.out.println(object.sub(retu,10));
			
	}
}
