import java.util.Scanner;

public class RetirementCalculator2 {

	public static void main(String[] args) {
		// Creating Variables
		double yearsToWork, yearsToWithdraw;
		double investmentRate, paybackRate;
		double requiredIncome, SSI, monthlySavings, overallSavings; //Figure out why variable is not used
		
		Scanner input = new Scanner(System.in); //System.in inputting into your system aka keyboard. Scanner is a listener, opens and waits for info to be inputed
		
		//Asking user questions
		System.out.println("How many years do you plan to work? ");
		yearsToWork = input.nextDouble();
		System.out.println("How much do you want for your expected average return on INVESTMENT mode? 0-20% ");
		paybackRate = input.nextDouble();
		System.out.println("How long to you want to withdraw for? ");
		investmentRate = input.nextDouble();
		System.out.println("How much do you want for your expected average return on PAYBACK mode? 0-3% ");
		yearsToWithdraw = input.nextDouble();
		System.out.println("How much is your required income? ");
		requiredIncome = input.nextDouble();
		System.out.println("How much is your expected SSI income? ");
		SSI = input.nextDouble();
		
		//Present Value Formula
		double annuityAmount; //MOst of these are to simplify the accounting formulas
		annuityAmount = (requiredIncome - SSI);
		double r;
		r = ((paybackRate/100)/12); //Accounting formula has an r value aka interest rate
		double n;
		n = (yearsToWithdraw * 12); //Accounting formula has an n value aka number of periods
		double workMonths;
		workMonths = (yearsToWork * 12);
		double rate; //Rate while working 0-20;
		rate = ((investmentRate/12)/100);
		
				
		overallSavings = (annuityAmount * (1-Math.pow(1/(1+r),n)))/r;
		
		monthlySavings = ((overallSavings * rate)/((Math.pow((1+rate),workMonths))-1));
		
		//System.out.println(overallSavings + " is how much you need to save."); Just commented out
		//System.out.println(monthlySavings + " is how much you need to save each month.");
		
		System.out.printf("Overall Savings is $%.2f %n",overallSavings);
		System.out.printf("This is how much you need to save monthly $%.2f ",overallSavings);
		

input.close();

	}

}
