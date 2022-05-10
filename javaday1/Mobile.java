package javaday1;
public class  Mobile{
	String mobilename="RealME";
	int storage=128;
	short model=9;
	boolean isNew=true;
	char firstWord='R';
	double price=18000.25007;
	long ipAddress=1921682125;

	float upTime=260.0736f; 
	public static void main(String[]args) {
		Mobile objectname=new Mobile();
		System.out.println(objectname.mobilename);
	}
}