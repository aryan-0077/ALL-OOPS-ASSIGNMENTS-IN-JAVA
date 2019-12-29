package Q6;

//it keeps track of all the equipment
interface Equipment{

    //set initial number of equipments
    void set(int a , int b , int c , int d , int e);

    //returns the total number of different type of equipment
    void getNum();

    //subtrats the number of particular equipment
    void reduce(String Ename , int num);

    //adds number to the equipment
    void add(String Ename , int num);
}