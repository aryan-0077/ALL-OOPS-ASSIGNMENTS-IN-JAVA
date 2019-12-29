import java.util.*;

 class Employee{

private String name;
private String enumber;
private String date;

Employee(){

}

Employee(String name, String number, String date)
{
	this.name= name;
	this.enumber= number;
	this.date= date;

}


void setName(String name){
this.name=name;
}


String  getName(){
return name;

}



void setNumber(String number){
this.enumber=number;
}

String getEmployeeNumber(){

return enumber;

}



void setDate(String date){
this.date=date;
}

String getDate(){

return date;
}

}

class ShiftSupervisor extends Employee{

private int salary, bonus;

ShiftSupervisor(String name, String number, String date,int salary, int bonus)
{
	super(name, number,date);
	this.salary=salary;
	this.bonus= bonus;

}

void setBonus(int bonus)
{
this.bonus= bonus;

}

int getBonus(){

return bonus;
}

void setSalary(int salary)
{
this.salary=salary;
}

int getSalary(){
return salary;
}


void getInformation(){

	System.out.println("Name : "+getName()+ " " + "Number : "+getEmployeeNumber() + "  "+ "Join date : "+getDate() );
	System.out.println("Salary : "+getSalary() + "  " +"Bonus : "+getBonus() +"\n");
}


}

public class Supervisor{

public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
String name, number, date;
int salary,bonus;

int n;
System.out.println("Enter the number of information you want to add : ");
n=sc.nextInt();
sc.nextLine();
ShiftSupervisor s[]=new ShiftSupervisor[n];

for(int i=0;i<n;i++)
{	

	System.out.println("Enter the name, number , date, salary, and bonus : ");
	name=sc.nextLine();
	number=sc.nextLine();
	date= sc.nextLine();
	salary=sc.nextInt();
	bonus=sc.nextInt();
	sc.nextLine();
s[i]=new ShiftSupervisor(name,  number,  date, salary,  bonus);
	
}

for(int i=0;i<n;i++){
s[i].getInformation();
}


}
}



