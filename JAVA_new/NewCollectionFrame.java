import java.util.ArrayList;

public class NewCollectionFrame {
    public static void main(String args[]){

        ArrayList<String> studentName=new ArrayList<>();      // create empty array in memory
        studentName.add("Vaibhavi");               // add element at the end of the list
        studentName.add("Siddhi");
        studentName.add("Purvika");

        System.out.println(studentName);

        studentName.add(1,"puja");    // add element at the particular position
        System.out.println(studentName);


        ArrayList <String>studInfo=new ArrayList<>();  // creating new array and add one array into another array
        studInfo.add("reeya");
        studInfo.add("priya");
        System.out.println(studInfo);

        studentName.addAll(studInfo);
        System.out.println(studentName);

        System.out.println(studentName.get(1));   // get element of a specific position

        System.out.println(studentName.remove(1));
        System.out.println(studentName);

        studentName(String.valueOf("reeya"));
        System.out.println(studentName);
        
    }
    
}
