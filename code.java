SavingsAccount s[]=new SavingsAccount[4];
		s[0]= new SavingsAccount(100, 10);
		s[1]=new SavingsAccount(21, 05);
		s[2]= new SavingsAccount(200, 15);
        s[3]=new  SavingsAccount(120, 04);
        



        /////////////////////////
        // Arrays of OBJECTS

        Customer s[]=new Customer[n];

	for(int i=0;i<n;i++)
	{	

		System.out.println("Enter the name,address, number , customernumber, list(true/false) : ");
		name=sc.nextLine();
		address=sc.nextLine();
		number=sc.nextInt();
		customernumber=sc.nextInt();
		list= sc.nextBoolean();
		sc.nextLine();
		s[i]=new Customer();
		s[i].setName(name);
		s[i].setAddress(address);
		s[i].setNumber(number);
		s[i].setCustomerNumber(customernumber);
		s[i].setList(list);
		
	
    }
    

    ////////////////////////////////
    // Arrays of Objects ...............

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



/////////////////////////////////////////////////////
// ARRAYS COPY

static int b[];
	static int totalNumber;
	static void setRoom(int a[])
	{
		b=new int[a.length];
		b=Arrays.copyOf(a,a.length);
    }
    

    ///////////////////////////////////
    // DECIMAL FORMAT

    import java.text.DecimalFormat;

class TaxMethods{
	
	static double basicRate = 4;
	static double luxuryRate = 10;
	
	public static double computeCostBasic(double price)
	{
		return (price+price*basicRate/100);
	}
	
	public static double computeCostLuxury(double price)
	{
		return (price+price*luxuryRate/100);
	}
	
	public static void changeBasicRateTo(double rate)
	{
		basicRate=rate;
	}
	
	public static void changeLuxuryRateTo(double rate)
	{
		luxuryRate=rate;
	}
	
	public static String roundToNearestPenny(double price)
	{
		DecimalFormat f= new DecimalFormat("##.00");
		return f.format(price);
		
	}
	
}

////////////////////////////////////////////////////
// Date of Birth

private String getAge(String dob) {
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String today = df.format(date);
    int day1 = Integer.parseInt(dob.substring(0,2));
    int mon1 = Integer.parseInt(dob.substring(3,5));
    int year1 = Integer.parseInt(dob.substring(6,10));
    int day2 = Integer.parseInt(today.substring(0,2));
    int mon2 = Integer.parseInt(today.substring(3,5));
    int year2 = Integer.parseInt(today.substring(6,10));
    //System.out.println(day1+" "+day2+" "+mon1+" "+mon2+" "+year1+" "+year2);
    if(day2 < day1)
    {
    if (mon2 == 3)
    {
        if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) 
        {
            day2 += 29;
        }
        
        else
        {
            day2 += 28;
        }                        
    }
    else if (mon2 == 5 || mon2 == 7 || mon2 == 10 || mon2 == 12) 
    {
       day2 += 30; 
    }
    else
    {
       day2 += 31;
    }      
    mon2 = mon2 - 1;
    }

if (mon2 < mon1)
{
    mon2 += 12;
    year2 -= 1;
}      
int day_diff = day2 - day1;
int mon_diff = mon2 - mon1;
int year_diff = year2 - year1;
    return year_diff+" years "+mon_diff + " months " + day_diff + " days ";
}


//////////////////////////////////////////////
/// Sort arrays of Strings

import java.util.*;
class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[] = new String[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter string: ");
			ar[i] = new String(sc.next());
		}
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++)
			{
				if(compareStrings(ar[i],ar[j])) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.print("Sorted strings are: ");
		for(int i=0;i<10;i++) {
			System.out.print(ar[i]+" ");
		}
    }
    // If str1 > str2 then only it will return true ->
	public static boolean compareStrings(String str1,String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int n = (len1<len2)?len1:len2;
		for(int i=0;i<n;i++) {
			if(str1.charAt(i) < str2.charAt(i))
				return false;
			else if(str1.charAt(i) > str2.charAt(i))
				return true;
		}
		if(len1<len2)
			return false;
		else
			return true;
	}
}



///////////////////////////////////////////////////////
////  

