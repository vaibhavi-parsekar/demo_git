
// // ✅ Method 1: By Extending Thread Class

// class Mythread extends Thread{
//     public void run(){
//         System.out.println("Hii");
//     }

// }
// public class ThreadExample {
//     public static void main(String[] args) {
//         Mythread t2=new Mythread();
//         t2.start();
//     }

    
// }

// -------------------------------------------------


//     class MyThread extends Thread{
//         public void run(){
//             //Task
//             for(int i=0; i<=10; i++){
//                 System.out.println(i);
//             }
//             try{
//                 Thread.sleep(1000);
//             }catch(Exception e){

//             }
//         }
//     }
// public class ThreadExample {

//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         t1.start();
        
//     }
    
// }



// ✅ // Method 2: By Implementing Runnable Interface

// class MyRunnable implements Runnable{
//     public void run(){
//         System.out.println("Thread is Running");
//     }

// }
// public class ThreadExample{
//     public static void main(String[] args) {
//         MyRunnable r1=new MyRunnable();
//        // r1.start();                        //  ------  Not working bcoz Runnable me start () method nahi hai..  vo thread class me start() method hai isliye thread ka object create kiya hai and rennable ka object ka refrence diya hai  

//        Thread t=new Thread(r1);
//        t.start();

        
//     }

// }




// class MyRunnable implements Runnable{

//     public void run(){
//         // task
//         for(int i = 10; i >= 1; i--){
//             System.out.println(i);
//             try{
//                 Thread.sleep(2000);

//             }catch(Exception e){

//             }

//         }
//     }
// }
// public class ThreadExample {
//     public static void main(String[] args) {
//         MyRunnable r=new MyRunnable();
//         Thread t=new Thread(r);
//         t.start();
//     }

// }


// ////////////////////Run  2 task at a time ///////////////////////////////////////

// class MyRunnable implements Runnable {
//     public void run() {
//         for (int i = 10; i > 1; i--) {
//             System.out.println("Runnable: " + i);
//             try {
//                 Thread.sleep(5000); // small pause to see interleaving
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class MyThread1 extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Thread1: " + i);
//             try {
//                 Thread.sleep(8000); // small pause to see interleaving
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class MultiThreadExample {
//     public static void main(String[] args) {
//         MyThread1 t1 = new MyThread1();
//         t1.start(); // Start first thread

//         Thread t2 = new Thread(new MyRunnable());
//         t2.start(); // Start second thread
//     }
// }



//---------------------------------------------------------------------------


// package oops; // Uncomment only if file is in oops folder

class UserThread extends Thread {
    public void run() {
        // task for thread
        System.out.println("This is user defined Thread");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {

        System.out.println("Program start");

        int x = 50 + 60;
        System.out.println("sum is " + x);

        // Get current thread (main)
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current Running Thread is " + tname);

        // Set thread name
        t.setName("Myname");
        System.out.println(t.getName());

        // Sleep 5 seconds
        try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread ID
        System.out.println(t.getId());

        // Start user-defined thread
        UserThread t1 = new UserThread();
        t1.start();

        System.out.println("Program end");
    }
}
