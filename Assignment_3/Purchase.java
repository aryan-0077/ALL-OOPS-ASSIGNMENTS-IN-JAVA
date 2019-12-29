import java.util.*;

class Customer {
	
	String name, address;
	int number, customernumber;
	
	Customer(){
	}
	
	Customer(String name, String address , int number , int customernumber)
	{
		this.name = name;
		this.address=address;
		this.number= number;
		this.customernumber= customernumber;
		
	}
	
	void setName(String name)
	{
		this.name= name;
	}
	
	String getName(){
		
		return name;
	}
	
	void setAddress(String address){
		
		this.address=address;
	}
	
	String getAddress(){
		return address;
	}
	
	void setNumber(int number)
	{
		this.number=number;
	}
	
	int getNumber(){
		return number;
	}
	
	void setCustomerNumber(int customernumber)
	{
		this.customernumber= customernumber;
	}

	int getCustomerNumber(){
		
		return customernumber;
	}
	
}

class PreferredCustomer extends Customer{
	
	private int amount;
	private int discount;
	
	PreferredCustomer(){
	}
	
	PreferredCustomer(String name, String address, int number , int customernumber, int amount,int discount)
	{
		super(name,address,number,customernumber);
		this.amount=amount;
		this.discount=discount;
		
	}
	
	void setAmount(int amount)
	{
		this.amount= amount;
	}
	
	int getAmount(){
		return amount;
	}
	
	void setDiscount(int discount)
	{
		
		this.discount=discount;
	}
	
	int getDiscount(){
		
		return discount;
	}
	
	
	void getInformation(){
		
		System.out.println("Name : "+getName()+ " " + "Address : "+getAddress() + "  "+ "Number : "+getNumber() + "  "+ "Customer Number : "+getCustomerNumber() );
	System.out.println("Amount spend : "+getAmount()+ "    "+ "Discount : "+ getDiscount());
	}
}

class Purchase{
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.println("Enter the no. of entries you want to make . ");
		
		n=sc.nextInt();
		sc.nextLine();
		
		String name, address;
		int number, customernumber;
		int amount, discount;
		
		PreferredCustomer s[]= new PreferredCustomer[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name, address, number, customernumber , amount :" );
			name=sc.nextLine();
			address= sc.nextLine();
			number= sc.nextInt();
			customernumber= sc.nextInt();
			amount= sc.nextInt();
			sc.nextLine();
			s[i]=new PreferredCustomer();
			
			
			s[i].setName(name);
			s[i].setAddress(address);
			s[i].setNumber(number);
			s[i].setCustomerNumber(customernumber);
			s[i].setAmount(amount);
			
			if(amount>=500 && amount<1000)
				s[i].setDiscount(5);
			
			else if(amount>=1000 && amount<1500)
			    s[i].setDiscount(6);
			
			else if(amount>=1500 && amount<2000)
			    s[i].setDiscount(7);
			
			else if(amount>=2000)
			    s[i].setDiscount(10);
			
			
			
		}
		
		for(int i=0;i<n;i++)
		{
			s[i].getInformation();
		}
		
	}
	
	
}