package Inheritance;

// class Animal{
//         String name="German shephard";
//         void eat(){
//             System.out.println("Eating");
//         }
//     }

//     class Dog extends Animal{
//         void bark(){
//             System.out.println("Barking");
//         }
//     }

// public class INheritance_example {


//     public static void main(String args[]){

//         Dog d1=new Dog();
//         d1.eat();
//         d1.bark();

//         System.out.println(d1.name);
//     }
    
// }




// ///////////////////////////////Hierarchical Inheritace //////////////////////////

// class Parent {
//     int a = 10;
//     void show() {
//         System.out.println("hii");
//     }

//     class ChildA {
//         int b = 20;
//         void display() {
//             System.out.println("Hello");
//         }
//     }

//     class ChildB {
//         int c = 30;
//         void demo() {
//             System.out.println("bye");
//         }
//     }

//     public static void main(String[] args) {
//         Parent p = new Parent();

//         Parent.ChildB cb = p.new ChildB();
//         cb.demo();
//         p.show();

//         Parent.ChildA ca = p.new ChildA();
//         ca.display();
//         p.show();
//     }
// }




//  ////////////////////////////////////////////////////////////Multiple Inheritace

// interface A {
//     void show();
// }

// interface B {
//     void display();
// }

// class C implements A, B {
//     public void show() {
//         System.out.println("Show from A");
//     }

//     public void display() {
//         System.out.println("Display from B");
//     }
// }

// public class INheritance_example {
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.show();
//         obj.display();
//     }
// }


// //////////////////////////////////Hybrid Inheritance ////////////////

interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C {
    void c();
}

class D implements B, C {
    public void a() { System.out.println("A"); }
    public void b() { System.out.println("B"); }
    public void c() { System.out.println("C"); }
}

public class INheritance_example {
    public static void main(String[] args) {
        D obj = new D();
        obj.a();
        obj.b();
        obj.c();
    }
}

