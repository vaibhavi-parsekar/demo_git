// public import java.util.*;

// public class ArraraaPro {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Take array size
//         System.out.print("Enter array size: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         // Take array elements
//         System.out.println("Enter " + size + " numbers:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Take number to search
//         System.out.print("Enter number to search: ");
//         int search = sc.nextInt();

//         // Search for number
//         int index = -1;
//         for (int i = 0; i < size; i++) {
//             if (arr[i] == search) {
//                 index = i;
//                 break;
//             }
//         }

//         // Print result
//         if (index != -1) {
//             System.out.println("Number " + search + " found at index: " + index);
//         } else {
//             System.out.println("Number not found in the array.");
//         }

//         sc.close();
//     }
// }
  

// class ArraraaPro {
//     public static void main(String[] args) {

//         int arr[] = {5, 2, 9, 1, 7};   

//         int max = arr[0];
//         int min = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             if (arr[i] > max) {
//                 max = arr[i];
//             }

//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         System.out.println("Maximum = " + max);
//         System.out.println("Minimum = " + min);
//     }
// }



// import java.util.Scanner;

// class ArraraaPro {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter " + n + " numbers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isSorted = true;

//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 isSorted = false;
//                 break;
//             }
//         }

//         if (isSorted) {
//             System.out.println("Array is sorted in ASCENDING order.");
//         } else {
//             System.out.println("Array is NOT sorted.");
//         }

//         sc.close();
//     }
// }



class ArraraaPro {
    public static void main(String[] args) {

        int arr[] = {1, 8, 5, 7, 9};  // Simple array

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
