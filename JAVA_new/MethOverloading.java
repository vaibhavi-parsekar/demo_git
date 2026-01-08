public class MethOverloading {
   public class OverloadExample {

    //  No argument
    public static int add() {
        return 10 + 20;
    }

    // With 2 arguments (int)
    public static int add(int a, int b) {
        return a + b;
    }

    //  With 2 arguments (double)
    public static double add(double a, double b) {
        return a + b;
    }

    //  With 3 arguments
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("No argument: " + add());
        System.out.println("Two int: " + add(5, 3));
        System.out.println("Two double: " + add(2.5, 3.5));
        System.out.println("Three int: " + add(1, 2, 3));
    }
}
    
}



// public class MethOverloading {

//     public static void show(int a) {
//         System.out.println("Integer: " + a);
//     }

//     public static void show(String name) {
//         System.out.println("String: " + name);
//     }

//     public static void show(double d) {
//         System.out.println("Double: " + d);
//     }

//     public static void main(String[] args) {
//         show(10);
//         show("Rahul");
//         show(10.5);
//     }
// }

    



