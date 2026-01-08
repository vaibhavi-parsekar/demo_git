
    // abstract class
    abstract class Vehicle{

        abstract void start(); //abstract method

        void fuelType(){     //Normal method
            System.out.println("Vehicle need fuel");
        }
    }

    class Car extends Vehicle{

        void start(){
            System.out.println("Car start with Key");
        }
    }

    class Bike extends Vehicle{

        void start(){
            System.out.println("Bike sart with self start");
        }
    }
   public class AbstractExample {
    
        public static void main(String[] args) {
            
            Vehicle v1= new Car();     // Parent class ka object nahi kar sakte ...kyuki abstract class and abstract method
        
            v1.start();
            v1.fuelType();


            Vehicle v2= new Bike();
            v2.start();
        
        
        }
    }
   
    

    
















