

// public class FunctionCode {

//     public static void show(){
//         System.out.println("Function in Java");
//     }

//     public static void main(String args[]){

//         show();

//     }
    
// }


//Function Without Return & Without Parameters

// public class FunctionCode {

//     public static void greet(){
//         System.out.println("Hello");
//     }


//     public static void main(String args[]){

//          greet();

//     }
    
// }


// Example 2: Function With Parameters
// public class FunctionCode{

//     public static void countsum(int a, int b){
//         System.out.println(a+b);
//     }

//     public static void main (String args[]){
//         countsum(5,4);
//     }

// }



//User input
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

// public class FunctionCode {

//     public static void show(String name){
//         System.out.println(name);
//     }

//     public static void main(String args[]){

//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         show(name);

//     }
    
// }


//ADDITION OF TWO NUMBER

// public class FunctionCode {
//     public static void main(String args[]){

//         int a=4;
//         int b=2;
//         int c=a+b;

//         System.out.println("Addition if tow number:"+c);
//     }


// }




// public class FunctionCode {

//     public static int add(int x, int y) {
//         return x + y;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int result = add(a, b);
//         System.out.println("Sum = " + result);
//     }
// }



// public class FunctionCode {

//     public static int mul(int x, int y) {
//         return x * y;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int result = mul(a, b);
//         System.out.println("Multiplication = " + result);
//     }
// }



// public class FunctionCode {

//     public static int div(int x, int y) {
//         return x / y;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int result = div(a, b);
//         System.out.println("Division= " + result);
//     }
// }




// public class FunctionCode {

//     public static int sub(int x, int y) {
//         return x - y;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int result = sub(a, b);
//         System.out.println("Substraction = " + result);
//     }
// }




// //////////////////////// FACTORIAL PROGRAM ///////////////////////////////

// public class FunctionCode{

// public static int factorial(int n) {
//         int fact = 1;

//         for(int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         return fact;
//     }

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int result = factorial(num);   // calling the function

//         System.out.println("Factorial of " + num + " = " + result);
//     }
//}





//                   //////TYPES OF FUNCION /////////////////////

// //1. Without Argument & Without Return Value

// public class FunctionCode {

//     public static void sum(){
//         int a=2;
//         int b=4;
//         System.out.println("The Addition is:"+(a+b));
//     }
//     public static void main(String args[]){
//         sum();
//     }
// }


// public class FunctionCode{

//     public static void sub(){
//         int a=8;
//         int b=4;
//         int res=a-b;

//         System.out.println("Substraction is:"+res);
//     }

//     public static void main(String args[]){
//         sub();
//     }
// }


//   //////////////////With Argument & Without Return Value

// public class FunctionCode {

//     public static void add(int a, int b) {
//         System.out.println("Addition = " + (a + b));
//     }

//     public static void main(String args[]) {
//         add(5, 3);
//     }
// }



// ///////////////////////////// 3. Without Argument & With Return Value

// public class FunctionCode {

//     public static int add() {
//         int a = 5;
//         int b = 3;
//         return a + b;
//     }

//     public static void main(String args[]) {
//         int result = add();
//         System.out.println("Addition = " + result);
//     }
// }


// /////////////// 4. With Argument & With Return Value

// public class FunctionCode {

//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String args[]) {
//         int result = add(5, 4);
//         System.out.println("Addition = " + result);
//     }
// }



