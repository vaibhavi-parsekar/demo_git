import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlngExample {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\BATCH_T212\\JAVA_new\\filehandling.txt"));
            
            String line;
            while ((line =br.readLine())!=null) {

                System.out.println(line);
                
            }
            br.close();
        }catch(IOException e){

            System.out.println("Error:"+e.getMessage());

        }
        
    }
    
}






// //Example 1: Read File Using FileReader (Character by Character)
// //import java.io.FileReader;
// import java.io.IOException;

// public class FileReaderExample {
//     public static void main(String[] args) {

//         try {
//             FileReader fr = new FileReader("C:\\BATCH_T212\\JAVA_new\\filehandling.txt");

//             int ch;
//             while ((ch = fr.read()) != -1) {
//                 System.out.print((char) ch);
//             }

//             fr.close();
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// 🔹 Example 2: Write Data to File Using FileWriter
// import java.io.FileWriter;
// import java.io.IOException;

// public class FileWriterExample {
//     public static void main(String[] args) {

//         try {
//             FileWriter fw = new FileWriter("C:\\BATCH_T212\\JAVA_new\\writefile.txt");
//             fw.write("Java File Handling Example");
//             fw.write("\nWriting data into file");

//             fw.close();
//             System.out.println("Data written successfully");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// 🔹 Example 3: Append Data to File
// import java.io.FileWriter;
// import java.io.IOException;

// public class AppendFileExample {
//     public static void main(String[] args) {

//         try {
//             FileWriter fw = new FileWriter("C:\\BATCH_T212\\JAVA_new\\writefile.txt", true);
//             fw.write("\nThis line is appended");

//             fw.close();
//             System.out.println("Data appended");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// 🔹 Example 4: Read File Using Scanner
// import java.io.File;
// import java.util.Scanner;

// public class ScannerReadExample {
//     public static void main(String[] args) {

//         try {
//             File file = new File("C:\\BATCH_T212\\JAVA_new\\filehandling.txt");
//             Scanner sc = new Scanner(file);

//             while (sc.hasNextLine()) {
//                 System.out.println(sc.nextLine());
//             }

//             sc.close();
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// 🔹 Example 5: Write File Using BufferedWriter
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;

// public class BufferedWriterExample {
//     public static void main(String[] args) {

//         try {
//             BufferedWriter bw = new BufferedWriter(
//                     new FileWriter("C:\\BATCH_T212\\JAVA_new\\bufferwrite.txt"));

//             bw.write("BufferedWriter Example");
//             bw.newLine();
//             bw.write("Writing data line by line");

//             bw.close();
//             System.out.println("File written successfully");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// 🔹 Example 6: Try-With-Resources (Best Practice)
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// public class TryWithResourcesExample {
//     public static void main(String[] args) {

//         try (BufferedReader br = new BufferedReader(
//                 new FileReader("C:\\BATCH_T212\\JAVA_new\\filehandling.txt"))) {

//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }

//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }










// 1Creating a File
// import java.io.File;

// public class FileHandlngExample {
//     public static void main(String[] args) {
//         try {
//             File f = new File("data.txt");
//             if (f.createNewFile()) {
//                 System.out.println("File created");
//             } else {
//                 System.out.println("File already exists");
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }



//2 Writing Data to a File
// import java.io.FileWriter;

// public class WriteFile {
//     public static void main(String[] args) {
//         try {
//             FileWriter fw = new FileWriter("data.txt");
//             fw.write("Welcome to Java File Handling");
//             fw.close();
//             System.out.println("Data written");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }



//3️Reading Data from a File
// import java.io.FileReader;

// public class ReadFile {
//     public static void main(String[] args) {
//         try {
//             FileReader fr = new FileReader("data.txt");
//             int ch;
//             while ((ch = fr.read()) != -1) {
//                 System.out.print((char) ch);
//             }
//             fr.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// 4 Using BufferedReader (Recommended)
// import java.io.*;

// public class BufferedRead {
//     public static void main(String[] args) throws Exception {

//         BufferedReader br = new BufferedReader(new FileReader("data.txt"));
//         String line;

//         while ((line = br.readLine()) != null) {
//             System.out.println(line);
//         }
//         br.close();
//     }
// }

// 5 Appending Data to File
// FileWriter fw = new FileWriter("data.txt", true);
// fw.write("\nNew Line Added");
// fw.close();

// 6️Deleting a File
// import java.io.File;

// public class DeleteFile {
//     public static void main(String[] args) {
//         File f = new File("data.txt");
//         if (f.delete()) {
//             System.out.println("File deleted");
//         } else {
//             System.out.println("File not found");
//         }
//     }
// }

// 7️ Reading File Using Scanner
// import java.io.File;
// import java.util.Scanner;

//  public class FileHandlngExample {
//     public static void main(String[] args) throws Exception {

//         File f = new File("data.txt");
//         Scanner sc = new Scanner(f);

//         while (sc.hasNextLine()) {
//             System.out.println(sc.nextLine());
//         }
//         sc.close();
//     }
// }