package javaday2;

public class employeeDetails {
	public void employeeName(String employeeName,int employeeID) {
System.out.println("enter the employeeName:"+employeeName);
System.out.println("enter the empID:"+employeeID);
}
	public void getEmployeeAddress(String employeeAddress) {
		System.out.println("enter the employee address:"+employeeAddress);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeDetails emp=new employeeDetails();
		emp.employeeName("pavitha", 25749);
		emp.getEmployeeAddress("chennai");

	}

}
