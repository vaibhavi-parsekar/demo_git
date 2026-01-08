public class StringExample {

    public static void main(String srgs[]){

        String str1="vaibhavi";
        System.out.println(str1);

        // String str2=str1+" Parsekar";
        // System.out.println(str2);

        String str3=new String("Tanvi");
        System.out.println(str3);

        String str4="java";
        System.out.println(str4.toUpperCase());
        String str5="java";
        System.out.println(str5.toLowerCase());

        // if(str4==str5){
        //     System.out.println("both are equals");
        // }else{
        //     System.out.println("Not equals");
        // }

        if(str4.equals(str5)){
            System.out.println("Both are equals");
        }else{
            System.out.println("Not equals");
        }


        String str6="rajesh";
        String str7=" abc";
        str6=str6+str7;
        // String str=str1.concat("vishwakarma");

        System.out.println(str6);

         System.out.println(System.identityHashCode(str6));
          System.out.println(System.identityHashCode(str7));

           System.out.println(System.identityHashCode(str6));


           String str9=str6;
           System.out.println(str9);
o

        
    }
    
}
