package Q6;

import Q6.Equipment;

class Football implements Equipment{

    private int NumStuds;
    private int NumJersey;
    private int NumSocks;
    private int NumShinGaurd;
    private int NumGloves;

    private static Football f;

    private Football(){}

    @Override
    public void set(int a , int b , int c , int d , int e){
        NumStuds = a;
        NumJersey = b;
        NumSocks = c;
        NumShinGaurd = d;
        NumGloves = e;
    }

    @Override
    public void getNum() {

        System.out.println("Equipment   |   Number Available");
        System.out.println(" Studs      |         " + NumStuds);
        System.out.println(" Jerseys    |         " + NumJersey);
        System.out.println(" HelSocks   |         " + NumSocks);
        System.out.println(" ShinGaurd  |         " + NumShinGaurd);
        System.out.println(" Gloves     |         " + NumGloves);
    }

    @Override
    public void reduce(String Ename, int num) {

        switch(Ename){

            case "Studs":
                NumStuds--;
                break;

            case "Jersey":
                NumJersey--;
                break;

            case "Gloves":
                NumGloves--;
                break;
                
            case "Shin Gaurd":
                NumShinGaurd--;
                break;
                
            case "Socks":
                NumSocks--;
                break;
                
            default:
                System.out.println("Enter correct choice");
                break;    
        }

    }

    @Override
    public void add(String Ename, int num) {

        switch(Ename){

            case "Studs":
                NumStuds++;
                break;

            case "Jersey":
                NumJersey++;
                break;

            case "Gloves":
                NumGloves++;
                break;
                
            case "Shin Gaurd":
                NumShinGaurd++;
                break;
                
            case "Socks":
                NumSocks++;
                break;
                
            default:
                System.out.println("Enter correct choice");
                break;    
        }
    }

    public static Football getInstance(){
        if (f == null)
            f = new Football();

        return f;    
    }
}