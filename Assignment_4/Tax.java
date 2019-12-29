import java.util.*;
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


class Tax {
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		double price ;
		System.out.println("Enter the price : ");
		price = sc.nextDouble();
		System.out.println("Basic Cost : "+ TaxMethods.computeCostBasic(price));
		System.out.println("Luxury Cost : "+ TaxMethods.computeCostLuxury(price));
		
		double newBasicRate;
		System.out.println("Enter the new basic Rate : ");
		newBasicRate= sc.nextDouble();
		TaxMethods.changeBasicRateTo(newBasicRate);
		
		double newLuxuryRate;
		System.out.println("Enter the new luxury Rate : ");
		newLuxuryRate= sc.nextDouble();
		TaxMethods.changeLuxuryRateTo(newLuxuryRate);
		
		System.out.println("Pricd to Nearest Penny : "+ TaxMethods.roundToNearestPenny(price));
		
		System.out.println("New Basic Cost : "+ TaxMethods.computeCostBasic(price));
		System.out.println("New Luxury Cost : "+ TaxMethods.computeCostLuxury(price));
		
	}
}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	