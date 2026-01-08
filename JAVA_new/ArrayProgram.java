import java.util.Scanner;

// 
    // public static void main(String args[]){
    //     int[] numbers=new int[6];
    //     numbers[0]=11;
    //     numbers[1]=12;
    //     numbers[2]=13;
    // // System.out.println(numbers[0]);
    // // System.out.println(numbers[1]);
    // // System.out.println(numbers[2]);

    // for(int i=0;i<3;i++){
    //     System.out.println(numbers[i]);
    // }
    
    // }
    





    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int[] numbers=new int[size];
    //     // numbers[0]=11;
    //     // numbers[1]=12;
    //     // numbers[2]=13;
    //     for(int i=0;i<size;i++){
    //         numbers[i]=sc.nextInt();

    //     }
    // // System.out.println(numbers[0]);
    // // System.out.println(numbers[1]);
    // // System.out.println(numbers[2]);

    // for(int i=0;i<size;i++){
    //    System.out.println(numbers[i]);
    // }
    
    // }

//}




import java.util.*;

public class ArrayProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }




  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Take array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Take number to search
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        // Search for number
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        // Print result
        if (index != -1) {
            System.out.println("Number " + search + " found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }

       
    }
}



}


