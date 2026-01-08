import java.util.Scanner;

// public class ExceptiionExample {
//     public static void main(String[] args) {
//         System.out.println("Java Developer");

//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a=sc.nextInt();

//         System.out.println("Enter second number:");
//         int b= sc.nextInt();

//         try{
//             System.out.println("Result:"+(a/b));

//         }
//         catch(ArithmeticException e){

//             // System.out.println(e);

//             System.out.println("Zero division error handle");
//         }

//         System.out.println("Python developer");
//     }
    
// }




// --------------NullPointer Exception--------------------------


//  public class ExceptiionExample {

//     public static void main(String[] args) {
        
//         String name=null;

//         try{

//             System.out.println(name.length());

//         }
//         catch(NullPointerException e){

//             System.out.println("NullPointerException handle");

//         }

//         System.out.println("Program run");
//     }
//  }









// 🔷 Remaining Common Exceptions in Java (With Examples)
// 1️⃣ ArrayIndexOutOfBoundsException

// ➡ Jab array ke size se bahar index access karte hain

// public class ArrayIndexExample {
//     public static void main(String[] args) {

//         int arr[] = {10, 20, 30};

//         System.out.println(arr[5]); // Exception
//     }
// }

// Output:
// ArrayIndexOutOfBoundsException

// 2️⃣ NumberFormatException

// ➡ Jab string ko number mein convert karte waqt galat value ho

// public class NumberFormatExample {
//     public static void main(String[] args) {

//         String str = "abc";
//         int num = Integer.parseInt(str); // Exception
//     }
// }

// 3️⃣ ClassCastException

// ➡ Jab galat type casting karte hain

// public class ClassCastExample {
//     public static void main(String[] args) {

//         Object obj = new Integer(10);
//         String s = (String) obj; // Exception
//     }
// }

// 4️⃣ InputMismatchException

// ➡ Jab Scanner se wrong data type input dete hain

// import java.util.Scanner;

// public class InputMismatchExample {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number:");
//         int a = sc.nextInt(); // Enter string → Exception
//     }
// }

// 5️⃣ StringIndexOutOfBoundsException

// ➡ Jab string ke length se zyada index access karte hain

// public class StringIndexExample {
//     public static void main(String[] args) {

//         String s = "Java";
//         System.out.println(s.charAt(10)); // Exception
//     }
// }

// 6️⃣ IOException (Checked Exception)

// ➡ File handling ke time error

// import java.io.FileReader;

// public class IOExceptionExample {
//     public static void main(String[] args) throws Exception {

//         FileReader fr = new FileReader("data.txt"); // File not found
//     }
// }

// 7️⃣ ClassNotFoundException (Checked Exception)

// ➡ Jab class runtime pe available na ho

// public class ClassNotFoundExample {
//     public static void main(String[] args) throws Exception {

//         Class.forName("oracle.jdbc.driver.OracleDriver");
//     }
// }

// 8️⃣ User-Defined Exception

// ➡ Khud ka exception banana

// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// }

// public class CustomExceptionExample {
//     static void checkAge(int age) throws InvalidAgeException {
//         if (age < 18)
//             throw new InvalidAgeException("Not eligible to vote");
//     }

//     public static void main(String[] args) throws Exception {
//         checkAge(15);
//     }
// }






