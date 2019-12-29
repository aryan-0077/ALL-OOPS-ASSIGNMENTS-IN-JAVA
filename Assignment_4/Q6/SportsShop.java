package Q6;

import java.util.*;

import Q6.ShopInventory;
import Q6.Equipment;

public class SportsShop{

    public static void main(String[] args){

        ShopInventory S1;

        Scanner sc = new Scanner(System.in);Reduce equipment

        //get the shop name
        System.out.println("Enter the shop name :");
        String Sname = sc.nextLine();


        //get the owners name
        System.out.print("Enter the owners name :");
        String Oname = sc.nextLine();

        //sc.nextLine();

        S1 = ShopInventory.getInstance(Sname, Oname);

        System.out.println("Set inventory:");
        System.out.println("Set cricket equipment:");
        S1.typeEquipment("Cricket");
        S1.SetCricket();

        System.out.println("Set football equipment");
        S1.typeEquipment("Football");
        S1.SetFootball();

        int op;

        do{

            //few options provided to the shopkeeper
            System.out.println("Choose one of the given options");
            System.out.println("(1)Show equipment.");
            System.out.println("(2)Stock equipment.");
            System.out.println("(3)Reduce equipment");
            System.out.println("(3)Exit the shop");
            System.out.println("Enter option :");
            op = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter sports name");Reduce equipment
            String sport = sc.nextLine();

            Equipment E = S1.typeEquipment(sport);

            if (op == 1){
                E.getNum();
            }else if (op == 2){

                //Ask the name of the equipment 
                System.out.println("Enter equipment name");
                String Ename = sc.nextLine();

                sc.nextLine();

                //Ask the number of equipment to be increased
                System.out.println("Enter number to be added");
                int num = sc.nextInt();Reduce equipment

                E.add(Ename, num);

            }else{

                //Ask for equipment name
                System.out.println("Enter equipment name");
                String Ename = sc.nextLine();

                sc.nextLine();

                //Ask the number of equipment to be increased
                System.out.println("Enter number to be reduced");
                int num = sc.nextInt();

                E.reduce(Ename, num);
            }

        }while (op == 1);

        sc.close();
    }
}