import java.util.*;
import java.text.*;
class Student {
	private String name,fatherName,dob;
	Student(String name,String fatherName,String dob) {
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getDob() {
		return dob;
	}
	private String getAge() {
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
	public void printData() {
		System.out.println("Name: "+name);
		System.out.println("Father's Name: "+fatherName);
		System.out.println("Age: "+getAge());
	}
}
class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter father's name: ");
		String fatherName = sc.next();
		System.out.print("Enter dob (dd/mm/yyyy): ");
		String dob = sc.next();
		Student student = new Student(name,fatherName,dob);
		student.printData();
	}
}