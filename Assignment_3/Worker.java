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


class ProductionWorker extends Employee{

private int shift;
private double hpr;

ProductionWorker(String name, String EmployeeNumber, String date,int shift, double hpr)
{
	super(name, EmployeeNumber,date);
	this. shift= shift;
	this.hpr= hpr; 
}
void setShift(int n){
this.shift= n;

}

int getshift(){
return shift;

}

void sethpr(double n){
this.hpr= n;

}

double gethpr(){
return hpr;

}




void getInformation(){

	System.out.println("Name : "+getName()+ " " + "Number : "+getEmployeeNumber() + "  "+ "Join date : "+getDate() );
	System.out.println("Shift : "+getshift() + "  " +"Hour Per day : "+gethpr() +"\n");
}

}


public class Worker{

public static void main(String args[])
{

ProductionWorker s[]=new ProductionWorker[5];

s[0]=new ProductionWorker("Aman","4044A","19/06/2018",2, 7.5);
s[1]=new ProductionWorker("Ayush","4037D","24/06/2018",1, 5.5);
s[2]=new ProductionWorker("Aryan","4086M","25/06/2018",2, 6.5);
s[3]=new ProductionWorker("Akshay","4046A","28/06/2018",1, 6);
s[4]=new ProductionWorker("Atul","4078","12/06/2018",1, 5.5);

s[0].getInformation();
s[1].getInformation();
s[2].getInformation();
s[3].getInformation();
s[4].getInformation();

s[0].sethpr(9.0);
System.out.println(" Hour per day of " + s[0].getName()+" is " + s[0].gethpr());

}
}























































