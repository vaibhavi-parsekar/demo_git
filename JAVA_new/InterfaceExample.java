// interface Animal{

//     void eat();

// }

// interface Pet {
//     void play();
    
// }

// class Dog implements Animal,Pet{
//     public void eat(){
//         System.out.println("Dog eats Bones");
//     }

//    public void play(){
//         System.out.println("Dogs play with balls");
//     }

// }

// public class InterfaceExample {

//     public static void main(String[] args) {
        
//         Dog d=new Dog();
//         d.eat();
//         d.play();
//     }
    
// }




//      //////////////////////////////////////// CHATGPT  EXAMPLES 

// interface Payment {
//     void pay();
// }

// class UPI implements Payment {
//     public void pay() {
//         System.out.println("Payment done using UPI");
//     }
// }

// class Card implements Payment {
//     public void pay() {
//         System.out.println("Payment done using Card");
//     }
// }

// public class PaymentApp {
//     public static void main(String[] args) {
//         Payment p;

//         p = new UPI();
//         p.pay();

//         p = new Card();
//         p.pay();
//     }
// }



interface Engine{
     void startEngine();
}

abstract class Vehical{
     String brand;

     Vehical(String brand){
        this.brand=brand;
     }

     void start(){
        System.out.println( brand+"Vehicle is startting");
     }

     abstract void fuelType();
}

class Car extends Vehical implements Engine{

    Car(String brand){
        super(brand);
    }


    @Override
    void fuelType(){
        System.out.println("Car uses Petrol or Diesel");
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine start with key or button");
    }
}


class Bike extends Vehical implements Engine{
    Bike(String brand){
        super(brand);
    }

    @Override
    void fuelType(){
        System.out.println("Bike uses petrol");
    }

    @Override
    public void startEngine(){
        System.out.println("Bike engine start using kick/self-start");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        
        Vehical car=new Car("Toyota");
        car.start();
        car.fuelType();
        ((Engine)car).startEngine();

        System.out.println("-------------------------------------------------");

        Vehical bike=new Bike("Honda");
        bike.start();
        bike.fuelType();
        ((Engine)bike).startEngine();
    }
}







// interface Animal {
//     void sound();
// }

// class Cat implements Animal {
//     public void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a = new Cat();
//         a.sound();
//     }
// }
