package Inheritance;

class Test{
    int age; //0
   String name; //null

   Test(int age,String name){
    age=age;
    this.age=age;
    this.name=name;

    System.out.println(age);

    //System.out.println(name);
   }
}

public class UsingThis {
    public static void main(String[] args) {
       
        Test t=new Test(50,"Reeya");
        Test k=new Test(22, "Tanvi");
    System.out.println();
    }
    
}
