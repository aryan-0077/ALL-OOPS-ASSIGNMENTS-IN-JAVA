package Q6;

import Q6.Equipment;

class Cricket implements Equipment{

    private int NumPad;
    private int NumBat;
    private int NumHelmet;
    private int NumShoes;
    private int NumGloves;

    private static Cricket c;

    private Cricket(){};

    @Override
    public void set(int a , int b , int c , int d , int e){
        NumPad = a;
        NumBat = b;
        NumHelmet = c;
        NumShoes = d;
        NumGloves = e;
    }

    @Override
    public void getNum() {
        
        System.out.println("Equipment   |   Number Available");
        System.out.println(" Bats       |         " + NumBat);
        System.out.println(" Pads       |         " + NumPad);
        System.out.println(" Helmets    |         " + NumHelmet);
        System.out.println(" Shoes      |         " + NumShoes);
        System.out.println(" Gloves     |         " + NumGloves);
    }

    @Override
    public void reduce(String Ename, int num) {

        switch(Ename){

            case "Bat":
                NumBat--;
                break;

            case "Pad":
                NumPad--;
                break;

            case "Gloves":
                NumGloves--;
                break;
                
            case "Shoes":
                NumShoes--;
                break;
                
            case "Helmet":
                NumHelmet--;
                break;
                
            default:
                System.out.println("Enter correct choice");
                break;    
        }

    }

    @Override
    public void add(String Ename, int num) {

        switch(Ename){

            case "Bat":
                NumBat++;
                break;

            case "Pad":
                NumPad++;
                break;

            case "Gloves":
                NumGloves++;
                break;
                
            case "Shoes":
                NumShoes++;
                break;
                
            case "Helmet":
                NumHelmet++;
                break;
                
            default:
                System.out.println("Enter correct choice");
                break;    
        }


    }

    public static Cricket getInstance(){
        if (c == null)
            c = new Cricket();

        return c;    
    }

}