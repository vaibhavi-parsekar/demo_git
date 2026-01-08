// import java.util.ArrayList;
// import java.util.jar.Attributes.Name;


// // ////////////////////////-----------  ARRAY LIST ---------------------////////////////////

// public class CollectionFramework {
//     public static void main(String[] args) {

//         ArrayList<String> name = new ArrayList<>();

//         name.add("Vaibhavi");  // ADD ELEMENT
//         name.add("Siddhi");
//         name.add("Purvika");
//         name.add("Reeya");

//         System.out.println(name);

//         name.addFirst("Diya");  // ADD FIRST
//         name.addLast("Siya");   // ADD LAST

//         name.add(0, "Sakshi"); 
//         System.out.println(name);

//         name.remove(0);             // REMOVE ELEMET
//         System.out.println(name);


//         name.removeFirst();   //REMOVE FIRST AND REMOVE LAST
//         System.out.println(name);

//         name.set(0,"JAVA"); 
//         System.out.println(name);

//         System.out.println(name.get(2));

//         System.out.println(name.size()); // SIZE

//         name.clear();
//         System.out.println(name);

 
//         // for(String str:name){                     // FOR LOOP
//         //     System.out.println(str);
//         // }

//     }
// }





// /////////////////////////-------LINKED LIST -------------////////////////////////////////


// import java.util.LinkedList;

// public class CollectionFramework{
//     public static void main(String[] args) {

//         LinkedList<String> list = new LinkedList<>();

//         // add()
//         list.add("Java");
//         list.add("Python");
//         list.add("C++");
//         System.out.println("After add(): " + list);

//         // addFirst()
//         list.addFirst("HTML");
//         System.out.println("After addFirst(): " + list);

//         // addLast()
//         list.addLast("JavaScript");
//         System.out.println("After addLast(): " + list);

//         // get()
//         System.out.println("Element at index 2: " + list.get(2));

//         // remove()
//         list.remove(3);
//         System.out.println("After remove(): " + list);

//         // size()
//         System.out.println("Size of list: " + list.size());
//     }
// }




// ////////////////////////--------STACK DATASTRUCTURE---------------------/////////////

// import java.util.Stack;

// public class CollectionFramework {
//     public static void main(String[] args) {

//         Stack<String> stack = new Stack<>();

//         // push()
//         stack.push("Java");
//         stack.push("Python");
//         stack.push("C++");
//         System.out.println("Stack: " + stack);

//         // peek()
//         System.out.println("Top element: " + stack.peek());

//         // pop()
//         stack.pop();
//         System.out.println("After pop(): " + stack);

//         // search()
//         System.out.println("Position of Java: " + stack.search("Java"));

//         // isEmpty()
//         System.out.println("Is stack empty? " + stack.isEmpty());
//     }
// }


// import java.util.Stack;

// public class CollectionFramework {
//     public static void main(String[] args) {

//         Stack<String> stack = new Stack<>();

//         // push() – add elements
//         stack.push("Java");
//         stack.push("Python");
//         stack.push("C++");
//         System.out.println("After push(): " + stack);

//         // peek() – view top element
//         System.out.println("Top element (peek): " + stack.peek());

//         // pop() – remove top element
//         stack.pop();
//         System.out.println("After pop(): " + stack);

//         // add() – works like push (not recommended)
//         stack.add("HTML");
//         System.out.println("After add(): " + stack);

//         // get() – access element by index
//         System.out.println("Element at index 1: " + stack.get(1));

//         // search() – returns 1-based position from top
//         System.out.println("Position of Java: " + stack.search("Java"));

//         // contains() – check element exists or not
//         System.out.println("Contains Python? " + stack.contains("Python"));

//         // size() – number of elements
//         System.out.println("Stack size: " + stack.size());

//         // isEmpty() – check empty or not
//         System.out.println("Is stack empty? " + stack.isEmpty());

//         // remove() – remove element using index
//         stack.remove(stack.size() - 1);
//         System.out.println("After remove(): " + stack);

//         // clear() – remove all elements
//         stack.clear();
//         System.out.println("After clear(): " + stack);

//         // empty() – stack specific method
//         System.out.println("Is stack empty (empty()): " + stack.empty());
//     }
// }



// ///////////////////////--------ARRAY DEQUE --------------////////////////////
// import java.util.ArrayDeque;
// import java.util.Queue;

// public class CollectionFramework {
//     public static void main(String[] args) {

//         Queue<String> q = new ArrayDeque<>();

//         // add() – insert element (throws exception if fails)
//         q.add("Java");
//         q.add("Python");

//         // offer() – insert element (returns false if fails)
//         q.offer("C++");

//         System.out.println("After add() & offer(): " + q);

//         // element() – view front element (exception if empty)
//         System.out.println("Front element (element): " + q.element());

//         // peek() – view front element (null if empty)
//         System.out.println("Front element (peek): " + q.peek());

//         // poll() – remove front element (null if empty)
//         q.poll();
//         System.out.println("After poll(): " + q);

//         // remove() – remove front element (exception if empty)
//         q.remove();
//         System.out.println("After remove(): " + q);

//         // contains() – check element
//         System.out.println("Contains C++? " + q.contains("C++"));

//         // size() – number of elements
//         System.out.println("Queue size: " + q.size());

//         // isEmpty() – check empty
//         System.out.println("Is queue empty? " + q.isEmpty());

//         // toArray() – convert queue to array
//         Object[] arr = q.toArray();
//         System.out.print("Queue as array: ");
//         for (Object o : arr) {
//             System.out.print(o + " ");
//         }
//         System.out.println();

//         // clear() – remove all elements
//         q.clear();
//         System.out.println("After clear(): " + q);

//         // peek() after clear
//         System.out.println("Peek after clear(): " + q.peek());
//     }
// }







// import java.util.ArrayDeque;
// import java.util.Queue;

// public class CollectionFramework {
//     public static void main(String[] args) {

//         Queue<Integer> q = new ArrayDeque<>();

//         // add elements
//         q.add(10);
//         q.add(20);
//         q.add(30);

//         // print queue
//         System.out.println("Queue: " + q);

//         // remove element (FIFO)
//         q.poll();

//         // print after removal
//         System.out.println("After poll(): " + q);
//     }
// }





// ///////////////----------HASHMAP-------------/////////////////////

// import java.util.HashMap;
// import java.util.Map;

// public class CollectionFramework {
//     public static void main(String[] args) {

//         HashMap<Integer, String> map = new HashMap<>();

//         // put() – add key-value pairs
//         map.put(1, "Java");
//         map.put(2, "Python");

//         map.put(3, "C++");map.put(6,"DSA");



//         // putIfAbsent()
//         map.putIfAbsent(4, "HTML");

//         System.out.println("After put(): " + map);

//         // get() – get value by key
//         System.out.println("Value at key 2: " + map.get(2));

//         // getOrDefault()
//         System.out.println("Value at key 5: " + map.getOrDefault(5, "Not Found"));

//         // containsKey()
//         System.out.println("Contains key 3? " + map.containsKey(3));

//         // containsValue()
//         System.out.println("Contains value Java? " + map.containsValue("Java"));

//         // remove(key)
//         map.remove(1);
//         System.out.println("After remove(key): " + map);

//         // replace()
//         map.replace(2, "Python", "JavaScript");
//         System.out.println("After replace(): " + map);

//         // keySet()
//         System.out.println("Keys: " + map.keySet());

//         // values()
//         System.out.println("Values: " + map.values());

//         // entrySet()
//         System.out.println("Entries:");
//         for (Map.Entry<Integer, String> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " = " + entry.getValue());
//         }

//         // size()
//         System.out.println("Size: " + map.size());

//         // isEmpty()
//         System.out.println("Is map empty? " + map.isEmpty());

//         // clear()
//         map.clear();
//         System.out.println("After clear(): " + map);
//     }
// }




// ////////////////--------------LinkedHashMap-----------------////////////////

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionFramework {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // putIfAbsent()
        map.putIfAbsent(4, "HTML");

        System.out.println("After put(): " + map);

        // get()
        System.out.println("Value at key 2: " + map.get(2));

        // containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3));

        // containsValue()
        System.out.println("Contains value Java? " + map.containsValue("Java"));

        // remove()
        map.remove(1);
        System.out.println("After remove(): " + map);

        // replace()
        map.replace(2, "Python", "JavaScript");
        System.out.println("After replace(): " + map);

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);
    }
}


