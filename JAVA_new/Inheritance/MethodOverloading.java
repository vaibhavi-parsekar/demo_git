// package Inheritance;

// class add{
//     void show(int a){
//         System.out.println(a);

//     }

//     void show(int a, int b){
//         System.out.println(a+b);
//     }

//     void show(int a, int b, int c){
//         System.out.println(a+b+c);

//     }
// }

// public class MethodOverloading {

//     public static void main(String[] args) {
        
//         add a=new add();
//         a.show(10);
//         a.show(10, 20);
//         a.show(10,20,30);
//     }
    
// }



package Inheritance;

//  //////////////////////////////////⭐ Example of Overloading main()

public class MethodOverloading  {

    public static void main(String[] args) {
        System.out.println("Main with String[] args");

        // You can call overloaded main() manually:
        main(10);
        main("Hello");
    }

    public static void main(int a) {
        System.out.println("Main with int: " + a);
    }

    public static void main(String msg) {
        System.out.println("Main with String: " + msg);
    }
}