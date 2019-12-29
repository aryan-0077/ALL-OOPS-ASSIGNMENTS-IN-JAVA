class Ship
{
	private String name;
	private String year;
	Ship()
	{
		
	}
	
	Ship(String name, String year)
	{
	
		
		this.name=name;
		this.year=year;
		
	}
	
	String getName()
	{
		return this.name;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getYear()
	{
		return this.year;
	}
	
	void Strng()
	{
		System.out.println("Ship Name : " + getName()+ "\n  " + "Built Year : "+ getYear() +"\n");
		
	}
	
}

class CruiseShip extends Ship
{
	private int passengers;
	
	CruiseShip(String name, int passengers)
	{
			super();
		setName(name);
		this.passengers=passengers;
	}
	
	int getPassengers()
	{
		return passengers;
	}
	
	void Strng()
	{
		System.out.println("Ship Name : "+ getName()+ " \n"+ "Maximum number of passengers  : " + getPassengers()+ " \n");
		
	}
	
}
	
class CargoShip extends Ship
{
	private int capacity;
	
	CargoShip(String name, int capacity)
	{
		super();
		setName(name);
		this.capacity=capacity;
	}
	
	int getCapacity()
	{
		return capacity;
	}
	
	void Strng()
	{
		System.out.println("Ship Name : "+ getName()+ " \n"+ "Maximum capacity  : " + getCapacity() + " \n");
		
		
	}
	
}

public class MainShip
{
	
	public static void main(String args[])
	{
		Ship s[]=new Ship[4];
		s[0] = new CruiseShip("Argonaute", 200);
		s[1] = new CargoShip("Clam", 500);
		s[2]= new CruiseShip("Atroops", 300);
		s[3] = new CargoShip("Flame", 250);
		
		s[0].Strng();
		s[1].Strng();
		s[2].Strng();
		s[3].Strng();
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	