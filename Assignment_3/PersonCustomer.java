import java.util.*;

class Person{
	
	private String name, address;
	private int number;
	
	Person(){
		
	}
	
	Person(String name, String address, int number)
	{
		this.name=name;
		this.address=address;
		this.number=number;
			
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName(){
		return name;
		
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	
	
	String getAddress(){
		return address;
	}
	
	void setNumber(int number )
	{
		this.number= number;
	}
	
	int getNumber(){
		return number;
	}
	
}

class Customer extends Person{
	
	private int customernumber;
	private boolean list;
	
	Customer(){
		
		
	}
	
	Customer(String name,String address, int number, int customernumber, boolean list)
	{
		super(name, address, number);
		this.customernumber=customernumber;
		this.list=list;
		
	}
	
	void setCustomerNumber(int n){
		
		customernumber=n;
		
	}
	
	int getCustomerNumber(){
		
		return customernumber;
	}
	
	void setList(Boolean response){
		
		list=response;
	}
	
	boolean getList(){
		
		if(list)
			return true;
		
		else
			return false;
	}
	
	void getInformation(){
		
		System.out.println("Name : "+getName()+ " " + "Address : "+getAddress() + "  "+ "Number : "+getNumber() + "  "+ "Customer Number : "+getCustomerNumber() );
	System.out.println("Want to be list or not : "+getList() +"\n");
	}
	
}

class PersonCustomer{
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		String name, address;
		int number, customernumber;
		boolean list;
		
		int n;
	System.out.println("Enter the number of information you want to add : ");
	n=sc.nextInt();
	sc.nextLine();
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
	
	for(int i=0;i<n;i++)
	{
		
		s[i].getInformation();
	}
	
	
	}	
		
	
}