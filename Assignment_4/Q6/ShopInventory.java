package Q6;
import Q6.Equipment;
import java.util.*;
import Q6.Cricket;
import Q6.Football;

class ShopInventory{

    Scanner sc = new Scanner(System.in);

    int a , b , c , d , e;

    //creates a single object for one shop
    private static ShopInventory shop;

    //type of equipment required
    Equipment E1 , E2;

    private ShopInventory(String name , String Oname){

        System.out.println("Shop name: "+name);
        System.out.println("Owner name: "+Oname);

    }

    public static ShopInventory getInstance(String name , String Oname){
        if (shop == null){
            shop = new ShopInventory(name, Oname);
        }

        return shop;
    }

    //show available type of sports
    void Type(){
        System.out.println("Sports whose equipments are available:");
        System.out.println("(1) Cricket");
        System.out.println("(2) Football");
    }

    void SetCricket(){

        System.out.println("Enter number of equipmets of cricket");
        System.out.print("Pads :");
        a = sc.nextInt();
        System.out.print("Bates :");
        b = sc.nextInt();
        System.out.print("Helmets :");
        c = sc.nextInt();
        System.out.print("Shoes :");
        d = sc.nextInt();
        System.out.print("Gloves :");
        e = sc.nextInt();

        E1.set(a, b, c, d, e);

    }

    void SetFootball(){

        System.out.println("Enter number of equipmets of cricket");
        System.out.print("Studs :");
        a = sc.nextInt();
        System.out.print("Jersey :");
        b = sc.nextInt();
        System.out.print("Socks :");
        c = sc.nextInt();
        System.out.print("Shin Gaurd :");
        d = sc.nextInt();
        System.out.print("Gloves :");
        e = sc.nextInt();

        E1.set(a, b, c, d, e);

    }

    public Equipment typeEquipment(String name){

        switch(name){

            case "Cricket":
                E1 = Cricket.getInstance();
                break;

            case "Football":
                E1 = Football.getInstance();
                break;    
        }

        return E1;

    }
}