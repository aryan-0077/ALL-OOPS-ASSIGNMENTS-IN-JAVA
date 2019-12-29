import java.io.*;

class A implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("Thread A"+i);
        }
    }
}


class B implements Runnable{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("Thread B"+i);
        }
    }
}

public class Thread1{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        
        Thread t1 = new Thread(a1,"Thread A");
        Thread t2 = new Thread(b1,"Thread B");
        t1.start();
        t2.start();
    }
}