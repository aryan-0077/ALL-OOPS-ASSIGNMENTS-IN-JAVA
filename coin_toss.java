String sideUp;
String a[] ={"Heads" , "Tails"};

coin(){

    Random r = new Random();
    sideUp = a[r.nextInt(2)];
}

void toss(){

    Random r = new Random();
    sideUp = a[r.nextInt(2)];
}