// public class ImportantProgram {
//     public static void main(String[] args) {
        
    
//     String str="JAVA";
//     char[]ch=str.toCharArray();

//     for(int i=ch.length-1; i>=0; i--){
//         System.out.println(ch[i]);

//     }
    
// }
// }




public class ImportantProgram {
    public static void main(String[] args) {
        // step 1=Input string
        String s="abbccc";

        // step 2=Frequency array (ASCII character)
        int[] arr=new int[127];

        // step 3=Count frequency of each character
        for(int i=0; i<s.length(); i++)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }

        // step 4= Variables to track maximum frequency
        int max=-1;
        char c=' ';

        // step 5= Find maximum repeated character
        for(int i=0; i<s.length(); i++)
        {
            if(max<arr[s.charAt(i)])
            {
                max=arr[s.charAt(i)];
                c=s.charAt(i);

            }
        }
        System.out.println("MAximunm character is :"+c);
    }

}



