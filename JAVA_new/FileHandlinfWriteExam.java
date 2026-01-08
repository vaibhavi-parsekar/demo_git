import java.io.FileWriter;
import java.io.IOException;

// public class FileHandlinfWriteExam {
//     public static void main(String[] args) {
        

//         try{
//             FileWriter fw=new FileWriter("C:\\BATCH_T212\\JAVA_new\\java10.txt");

//             fw.write("Hello Java File Handling\n");
//             fw.write("Writing data using FileWriter");
//             fw.write("Create java10.txt file");
//             fw.close();
//             System.out.println("Successfully written");
//         }
//         catch(IOException e){

//             System.out.println("Error: "+e.getMessage());

//         }
//     }
    
// }



//  APPEND

public class FileHandlinfWriteExam {
    public static void main(String[] args) {
        

        try{
            FileWriter fw=new FileWriter("C:\\BATCH_T212\\JAVA_new\\java10.txt", true);

            fw.write("Hello Java File Handling\n");
            fw.write("Writing data using FileWriter");
            fw.write("Create java10.txt file");
            fw.close();
            System.out.println("Successfully written");
        }
        catch(IOException e){

            System.out.println("Error: "+e.getMessage());

        }
    }
    
}
