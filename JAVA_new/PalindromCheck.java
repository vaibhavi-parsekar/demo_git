// public class PalindromCheck {
//     public static void main(String args[]){

//         int num=153;
//         int temp=num;
//         int sum=0;


//         while (temp>0) {
            
//             int digit=temp % 10;                   //extract last digit
//             sum +=digit*digit*digit; //cube       //add cube of a digit
//             temp/=10;                             //remove the last digit
            
//         }

//         if (sum == num) {
//             System.out.println(num + " is an Armstrong Number");
//         } else {
//             System.out.println(num + " is NOT an Armstrong Number");
//         }
//     }
// }









































// public class PalindromCheck {

//     public static void main(String[] args) {

//         for (int num = 1; num <= 1000; num++) {

//             int original = num;
//             int sum = 0;
//             int temp = num;

//             while (temp > 0) {
//                 int digit = temp % 10;
//                 sum += (digit * digit * digit);
//                 temp /= 10;
//             }

//             if (sum == original) {
//                 System.out.println(original + " is an Armstrong Number");
//             }
//         }

//     }
// }
