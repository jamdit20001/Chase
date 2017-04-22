package employeeinfo;

public class Employee {
	int empId;
	String empName;
	int empSalary;
	int empBonus;
	int empTotalPay;
	
	
	void calculateTotalPay(){
		empTotalPay = empSalary + empBonus;
	}
	}

	
	