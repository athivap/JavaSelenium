package javaday1;

public class Car{
	public void applyBreak() {
		System.out.println("press break");
		
	}
	public void applyGear() {
		System.out.println("put gear");
	}
	public void switchonAC() {
		System.out.println("press AC button");
	}
	public void applyAccelerate() {
		System.out.println("put accelerator");
	}
	public static void main(String[]args) {
		Car c=new Car();
		c.applyAccelerate();
		c.applyBreak();
		c.applyGear();
		c.switchonAC();
	}
}

