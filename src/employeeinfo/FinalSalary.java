package employeeinfo;

public class FinalSalary {

	public static void main(String[] args) {
		 Employee Alex = new Employee();
		 Alex.empId = 100;
		 Alex.empName ="Alex Rod";
		 Alex.empSalary = 5000;
		 Alex.empBonus = 300;
		 Alex.calculateTotalPay();
		 System.out.println("Total pay = " + Alex.empTotalPay);
		 
		 
		 Employee lynda = new Employee();
		 lynda.empId = 100;
		 lynda.empName ="lynda berry";
		 lynda.empSalary = 5000;
		 lynda.empBonus = 300;
		 lynda.calculateTotalPay();
		 System.out.println("Total pay = " + lynda.empTotalPay);
		 
		 
		 
		 
		

	}

}
