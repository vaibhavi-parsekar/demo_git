import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


// REMOVE DUPLICATE VALUE
// public class ImpCollFramework {

//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(10, 20, 30, 10, 20);
//         Set<Integer> set = new LinkedHashSet<>(list);
//         System.out.println(set);
//     }
// }



// //////// CALCULATE FREQUENCY OF WORDS

// public class ImpCollFramework {
//     public static void main(String[] args) {
//         String s="java is easy java is powerful";
//         String[]words=s.split(" ");
//         Map<String, Integer> map=new HashMap<>();

//         for(String word:words){
//             map.put(word, map.getOrDefault(words, 0)+1);

//         }
//         System.out.println(map);
//     }

    
// }


// ///////////////FIND DUPLICATE VALUESM

public class ImpCollFramework {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1);

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer i : list) {
            if (!set.add(i)) {   // add() returns false if element already exists
                duplicates.add(i);
            }
        }

        System.out.println("Duplicate values: " + duplicates);
    }
}
