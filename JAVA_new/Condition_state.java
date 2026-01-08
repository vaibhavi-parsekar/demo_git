import java.util.Scanner;

public class Condition_state {

    // public static void main(String args[]){
    //     int age=15;
    //     if (age>=18){
    //         System.out.println("You can vote");
    //     }
    //     else{
    //         System.out.println("You can not vote");
    //     }
    // }
    



    // public static void main(String agrs[]){
    //     int marks=70;

    //     if(marks>=90){
    //         System.out.println("Grade A");
    //     }
    //     else if(marks>=80){
    //         System.out.println("Grade B");
    //     }
    //     else if(marks>70){
    //         System.out.println("Grade C");
    //     }
    //     else if(marks>60){
    //         System.out.println("Grade D");
    //     }
    //     else if(marks>=50){
    //         System.out.println("Grade E");
    //     }
    //     else{
    //         System.out.println("Fail");
    //     }
    // }



    //take values from user

    // public static void main (String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Enter your age:");
    // int age =sc.nextInt();

    // if (age>=18){
    //     System.out.println("You can vote");
    // }else{
    //     System.out.println("You can not vote");
    // }

    // }


  

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();
    //     if (num > 0) {
    //         System.out.println("The number is positive.");
    //     } else if (num < 0) {
    //         System.out.println("The number is negative.");
    //     } else {
    //         System.out.println("The number is zero.");
    //     }

    // }


    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter your age: ");
    //     int age = sc.nextInt();

    //     if (age >= 18) {
    //         System.out.println("You are eligible for a driving license.");
    //     } else {
    //         System.out.println("You are not eligible for a driving license.");
    //     }

       
    // }


    // public static void main(String args[]){

    //     Scanner sc=new Scanner(System.in);

    //     System.out.print("Enter your age:");
    //     int age=sc.nextInt();

    //     if(age>=18){
    //         System.out.println("Do you have voter id?");
    //         String voter_id=sc.next();

    //         if(voter_id.equalsIgnoreCase("yes")){
    //             System.out.println("you can vote");
    //         }
    //         else{
    //             System.out.println("Get voter id");
    //         }
            
    //     }else{
    //         System.out.println("You can not vote");
    //     }
    // }




//SWITCH CASE

// public static void main(String args[]){
//     int day=4;
    
//     switch (day) {
//         case 1:
//         {
//             System.out.println("Sunday");
//         }
//             break;

//         case 2:
//         {
//             System.out.println("Monday");
//         }
//             break;

//         case 3:
//         {
//             System.out.println("Tuesday");
//         }
//             break;

//         case 4:
//         {
//             System.out.println("Wednday");
//         }
//             break;

//         case 5:
//         {
//             System.out.println("Thursday");
//         }
//             break;

//         case 6:
//         {
//             System.out.println("Friday");
//         }
//             break;

//         case 7:
//         {
//             System.out.println("Saturday");
//         }
//             break;
    
//         default:
//         {
//             System.out.println("OTHER DAY");
//         }
//             break;
//     }
// }




//LEAP YEAR

// public static void main(String args[]){

//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter Year");
//     int year=sc.nextInt();

//     if((year%4==0 && year%100!=0)|| year%400==0){
//         System.out.println(year+" This is leap year");
//     }else{
//         System.out.println(year+" Is not leap year");
//     }
// }



//Login system program

// public static void main(String args[]){

//     String user_name="vaibhavi";
//     String pass_word="2004";
//     Scanner sc=new Scanner(System.in);

//     System.out.println("Enter user name ");
//     String username=sc.next();

//     System.out.println("Enter your password");
//     String password=sc.next();

//     if(username.equals(user_name) && password.equals(pass_word)){
//         System.out.println("Successfully Login");
//     }else{
//         System.out.println("User name and password are incorrect");
//     }

// }



    // String a="Yes";
    // String b=new String("yes");
    // System.out.println(a.eqaalsIgnoreCase(b));

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal color (Red / Yellow / Green): ");
        String color = sc.next().toLowerCase();

        if (color.equals("red")) {
            System.out.println("STOP! ");
        } else if (color.equals("yellow")) {
            System.out.println("READY TO GO! ");
        } else if (color.equals("green")) {
            System.out.println("GO! ");
        } else {
            System.out.println("Invalid color! Please enter Red, Yellow, or Green.");
        }
    }
}








