package Inheritance;

class Vehical{
    void run(){
        System.out.println("Vehical is running");
    }
}

class Bike extends Vehical{
    @Override

    void run(){
        System.out.println("Bike is running safely");
    }
}

public class BasicOverriding {
    public static void main(String[] args) {
        
    Vehical v=new Bike();
    v.run();
    
    }

}
