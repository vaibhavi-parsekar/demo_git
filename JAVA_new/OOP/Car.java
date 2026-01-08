package OOP;

// public class Car {

//     //PROPERTIES VARIABLE
//     String brand;
//     String color;
//     int speed;

//     //METHOD 1
//     void start(){
//         System.out.println(brand + " Startting... ");

//     }

//     //METHOD 2
//     void stop(){
//         System.out.println(brand + " Stopping.. ");

//     }

//     //METHOD3: Increase speed
//     void acceleration(int value){
//         speed +=value;
//         System.out.println(brand + " Speed is now " + speed + " km/h ");

//     }


//     public static void main(String args[]){

//         //CREATING OBJECT FOR CAR
//         Car c1=new Car();


//         //INITIALING OBJECT VALUE

//         c1.brand="BMW";
//         c1.color="black";
//         c1.speed=0;             //STARING SPEED


//         //CALLING METHOD

//     c1.start();
//     c1.acceleration(20);
//     System.out.println(c1.speed);
//     c1.acceleration(30);
//     System.out.println(c1.speed);
//     c1.stop();


//  }   
// }





// class Mobile {

//     String brand;
//     int battery;

//     void call() {
//         System.out.println(brand + " is making a call...");
//     }

//     void charge(int value) {
//         battery += value;
//         System.out.println(brand + " battery is now " + battery + "%");
//     }

//     public static void main(String[] args) {

//         Mobile m1 = new Mobile();
//         m1.brand = "Samsung";
//         m1.battery = 50;

//         m1.call();
//         m1.charge(20);
//     }
// }



// ////////////////////////////Fan example

// class Fan {

//     String color;
//     int speed;

//     void turnOn() {
//         System.out.println("Fan is ON");
//     }

//     void increaseSpeed(int level) {
//         speed += level;
//         System.out.println("Speed is now: " + speed);
//     }

//     void turnOff() {
//         System.out.println("Fan is OFF");
//     }

//     public static void main(String[] args) {

//         Fan f1 = new Fan();
//         f1.color = "White";
//         f1.speed = 0;

//         f1.turnOn();
//         f1.increaseSpeed(2);
//         f1.increaseSpeed(1);
//         f1.turnOff();
//     }
// }



// //////////////////////////Bank Account Example 
// class Car {

//     String name;
//     double balance;

//     void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//         System.out.println("New Balance: " + balance);
//     }

//     void withdraw(double amount) {
//         balance -= amount;
//         System.out.println("Withdrawn: " + amount);
//         System.out.println("Remaining Balance: " + balance);
//     }

//     public static void main(String[] args) {

//         BankAccount b1 = new BankAccount();
//         b1.name = "Alex";
//         b1.balance = 1000;

//         b1.deposit(500);
//         b1.withdraw(300);
//     }
// }




// public class Car{

//     String name;
//     double balance;


//     void Withdrawn(double amount){
//         balance -= amount;
//         System.out.println("Withdrawn : " + amount);
//         System.out.println(" Remaining Balance is : " + balance);

//     }

//     void deposit(double amount){
//         balance += amount;
//         System.out.println("Deposited : "+ amount);
//         System.out.println("Available balance is : "+ balance);

//     }


//     public static void main(String args[]){

//         Car c3=new Car();

//         c3.name="Vaibhavi";
//         c3.balance=30000;

//         c3.deposit(5000);
//         c3.Withdrawn(10000);
//     }
// }






 // /////////////////////////////CREATING MULTIPLE OBJECT ///////////////////////////

// package OOP;

// public class Car {

//     //PROPERTIES VARIABLE
//     String brand;
//     String color;
//     int speed;

//     //METHOD 1
//     void start(){
//         System.out.println(brand + " Startting... ");

//     }

//     //METHOD 2
//     void stop(){
//         System.out.println(brand + " Stopping.. ");

//     }

//     //METHOD3: Increase speed
//     void acceleration(int value){
//         speed +=value;
//         System.out.println(brand + " Speed is now " + speed + " km/h ");

//     }


//     public static void main(String args[]){

//         //CREATING OBJECT FOR CAR
//         Car c1=new Car();


//         //INITIALING OBJECT VALUE

//         c1.brand="BMW";
//         c1.color="black";
//         c1.speed=0;             //STARING SPEED


//         //CALLING METHOD

//     c1.start();
//     c1.acceleration(20);
//     System.out.println(c1.speed);
//     c1.acceleration(30);
//     System.out.println(c1.speed);
//     c1.stop();


//     Car c2=new Car();         //Creating New Object

//     c2.brand="THAR";
//         c2.color="black";
//         c2.speed=0;  
//         c2.acceleration(50);  

//  }   
// }



