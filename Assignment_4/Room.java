import java.util.*;

class RoomOccupancy{
	
	static int b[];
	static int totalNumber;
	static void setRoom(int a[])
	{
		b=new int[a.length];
		b=Arrays.copyOf(a,a.length);
	}
	
	static void setTotal(int n)
	{
		totalNumber=n;
	}
	
	
	
	
	static void addOneToRoom(int i)
	{
		b[i]++;
		totalNumber++;
	}
	
	static void removeOneFromRoom(int i)
	{
		if(b[i] >0)
		{
			b[i]--;
			totalNumber--;
			
		}
		
		else
			System.out.println("Room is empty.");
		
	}
	
	static int getNumber(int i){
		return b[i];
	}
	
	static int getTotal(){
		return totalNumber;
	}
	
	
}

class Room{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of rooms : ");
		int n= sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("Enter the number of people in room : ");
		
		for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
		
		RoomOccupancy.setRoom(a);
		
		int totalpeople=0;
		for(int i=0;i<n;i++)
			totalpeople+=a[i];
		
		RoomOccupancy.setTotal(totalpeople);
		
		
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Adding one people in room 3");
		RoomOccupancy.addOneToRoom(3);
		System.out.println("Number of people in the room : "+ 3 + " is "+ RoomOccupancy.getNumber(3));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Adding one people in room 2");
		RoomOccupancy.addOneToRoom(2);
		System.out.println("Number of people in the room : "+ 3 + " is "+ RoomOccupancy.getNumber(2));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Adding one people in room 3");
		RoomOccupancy.addOneToRoom(3);
		System.out.println("Number of people in the room : "+ 3 + " is "+ RoomOccupancy.getNumber(3));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Adding one people in room 3");
		RoomOccupancy.addOneToRoom(3);
		System.out.println("Number of people in the room : "+ 3 + " is "+ RoomOccupancy.getNumber(3));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Adding one people in room 2");
		RoomOccupancy.addOneToRoom(2);
		System.out.println("Number of people in the room : "+ 2 + " is "+ RoomOccupancy.getNumber(2));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		
		
		System.out.println("Removing one people in room 3");
		RoomOccupancy.removeOneFromRoom(3);
		System.out.println("Number of people in the room : "+ 3 + " is "+ RoomOccupancy.getNumber(3));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		System.out.println("Removing one people in room 2");	
		RoomOccupancy.removeOneFromRoom(2);
		System.out.println("Number of people in the room : "+ 2 + " is "+ RoomOccupancy.getNumber(2));
		System.out.println("Total number of people in all rooms : "+ RoomOccupancy.getTotal());
		
		
		
		
		
		
		
	}
}