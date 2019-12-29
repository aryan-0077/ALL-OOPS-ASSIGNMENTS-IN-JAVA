import java.util.*;

abstract class Tax{
	
	Tax(){
	}
	
	abstract void  income_upto_25();
	abstract void income_upto_30();
	abstract void income_bet_30_50();
	abstract void income_bet_25_50();
	
	abstract void income_bet_50_100();
	abstract void income_above_100();
	
	abstract double getTax();
	
}

class MenBelow60 extends Tax{
	
	int salary;
	double tax;
	
	MenBelow60(int salary)
	{
		this.salary= salary;
		
		decideMethod();
		
	}
	
	void decideMethod(){
		
		if(salary <= 250000)
			income_upto_25();
		
		else if(salary >250000 && salary <= 500000)
			income_bet_25_50();
		
		else if(salary > 500000 && salary <= 1000000)
			income_bet_50_100();
		
		else if(salary >1000000)
			income_above_100();
	}
	
	void income_upto_30(){
		
	}
	
	void income_bet_30_50(){
	
	}
	
	void income_upto_25()
	{
		this.tax =0;
		
	}
	
	void income_bet_25_50()
	{
		this.tax= 5* (this.salary) /100;
	}
	
	void income_bet_50_100()
	{
		this.tax= 0.2 * this.salary;
	}
	
	void income_above_100()
	{
		this.tax= 0.3 * this.salary;
	}
	
	double getTax()
	{
		return this.tax;
	}
}


class WomenBelow60 extends Tax{
	
	int salary;
	double tax;
	
	WomenBelow60(int salary)
	{
		this.salary= salary;
		decideMethod();
	}
	
	void decideMethod(){
		
		if(salary <=250000)
			income_upto_25();
		
		else if(salary >250000 && salary <= 500000)
			income_bet_25_50();
		
		else if(salary> 500000 && salary <= 1000000)
			income_bet_50_100();
		
		else if(salary >1000000)
			income_above_100();
	}
	
	void income_upto_30(){
		
	}
	
	void income_bet_30_50(){
	
	}
	
	
	void income_upto_25()
	{
		this.tax =0;
		
	}
	
	void income_bet_25_50()
	{
		this.tax= 5* (this.salary) /100;
	}
	
	void income_bet_50_100()
	{
		this.tax= 0.2 * this.salary;
	}
	
	void income_above_100()
	{
		this.tax= 0.3 * this.salary;
	}
	
	double getTax()
	{
		return this.tax;
	}
}
	
	
class SeniorCitzensBelow80 extends Tax{
	
	int salary;
	double tax;
	
	SeniorCitzensBelow80(int salary)
	{
		this.salary= salary;
	}
	
	
	void decideMethod(){
		
		if(salary <= 300000)
			income_upto_30();
		
		else if(salary >300000 && salary <= 500000)
			income_bet_30_50();
		
		else if(salary> 500000 && salary <= 1000000)
			income_bet_50_100();
		
		else if(salary >1000000)
			income_above_100();
	}
	
	void  income_upto_25(){
		
	}
	
	void income_bet_25_50(){
		
	}
	
	void income_upto_30()
	{
		tax=0;
	}
	
	void income_bet_30_50()
	{
		this.tax = 0.05* salary;
		
	}
	
	void income_bet_50_100()
	{
		this.tax= 0.2 * salary;
	}
	
	void income_above_100()
	{
		this.tax = 0.3 * salary;
	}
	
	double getTax()
	{
		return tax;
		
	}
	
}
	
	
class PayTax{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int age;
		char c;
		int salary;
		
		System.out.print("Enter the gender (M/F) : ");
		c= sc.next().charAt(0);
		
		System.out.print("Enter the age : ");
		age= sc.nextInt();
		
		System.out.print("Enter the salary : ");
		salary= sc.nextInt();
		
		Tax ob;
		
		if(age < 60 &&  c=='M')
			ob = new MenBelow60(salary);
		
		else if(age <= 60 &&  c=='F')
			ob = new WomenBelow60(salary);
		
		else 
			ob = new SeniorCitzensBelow80(salary);
		
		System.out.print("Your tax is : " + ob.getTax());
		
		
	}

}
	
	
