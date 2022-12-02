package week03_homework;

public class Task1_SalaryCalculator {

	public static void main(String[] args) {
		
		int hourlyRate = 50;
	    int weeklyHours = 45;
	    int totalHours = weeklyHours * 52;
	    double stateTaxRate = 6;
	    double stateTaxRateInFraction = stateTaxRate/100;
	    double federalTaxRate = 26;
	    double federalTaxRateInFraction = federalTaxRate/100;
	    
	    int salaryBeforeTax = hourlyRate * totalHours;
	    double stateTax = salaryBeforeTax * stateTaxRateInFraction;
	    double federalTax = salaryBeforeTax * federalTaxRateInFraction;
	    double totalTax = stateTax + federalTax;
	    double netSalary = salaryBeforeTax - totalTax;

	    System.out.println("Output:");
	    System.out.println("Gross Pay is: $" + salaryBeforeTax);
	    System.out.println("Federal tax is: $" + federalTax);
	    System.out.println("State tax is: $" + stateTax);
	    System.out.println("Total tax is: $" + totalTax);
	    System.out.println("Net Income is: $" + netSalary);
	}

}
